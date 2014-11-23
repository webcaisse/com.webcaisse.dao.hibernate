package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ISessionDao;
import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Session;

public class SessionDao implements ISessionDao {
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public Session loadSessionById(Long sessionId) {
		Query req = sessionFactory.getCurrentSession().createQuery("select s from Session s where s.id=:id " ) ;
		 req.setParameter("id", sessionId) ;
		 return (Session) req.uniqueResult() ;
	}

	
	@Transactional
	public List<Commande> rechercherCommande(Long idSession) {
		 Query req = sessionFactory.getCurrentSession().createQuery("select c from Commande c where c.session.id=:x " ) ;
		    req.setParameter("x", idSession) ;
		    return req.list() ;
	
	}
	
	

}
