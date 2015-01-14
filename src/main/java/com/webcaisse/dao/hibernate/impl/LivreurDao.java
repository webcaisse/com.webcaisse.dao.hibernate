package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ILivreurDao;
import com.webcaisse.dao.hibernate.model.Livreur;

import org.hibernate.Query;

public class LivreurDao implements ILivreurDao{

	
	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;
	
	
	@Transactional
	public void sauvegarderLivreur(Livreur livreur) {
		
		sessionFactory.getCurrentSession().save(livreur) ;
		
	}

	@Transactional
	public List<Livreur> rechercherLivreur(Long idSociete) {
		
		Query query= sessionFactory.getCurrentSession().createQuery(" select l from Livreur l where l.societe.id=:x ") ;
		query.setParameter("x", idSociete) ;
		
		return query.list();
	}

	
	@Transactional
	public Livreur loadLivreurById(Long idLivreur) {
		
		Query query=sessionFactory.getCurrentSession().createQuery("select l from Livreur l where l.id=:x");
		query.setParameter("x",idLivreur) ;
		
		
		return (Livreur) query.uniqueResult();
	}

	
}
