package com.webcaisse.dao.hibernate.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ISocieteDao;
import com.webcaisse.dao.hibernate.model.Session;
import com.webcaisse.dao.hibernate.model.Societe;



public class SocieteDao implements ISocieteDao {

	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public Societe loadById(Long societeId) {
		 Query req = sessionFactory.getCurrentSession().createQuery("select s from Societe s where s.id=:id " ) ;
		 req.setParameter("id", societeId) ;
		 return (Societe) req.uniqueResult() ;
	}

	@Transactional
	public Session loadSessionById(Long sessionId) {
		Query req = sessionFactory.getCurrentSession().createQuery("select s from Session s where s.id=:id " ) ;
		 req.setParameter("id", sessionId) ;
		 return (Session) req.uniqueResult() ;
	}

}
