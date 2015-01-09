package com.webcaisse.dao.hibernate.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ICommandeDao;
import com.webcaisse.dao.hibernate.model.Commande;


public class CommandeDao implements ICommandeDao {

	
	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public Commande loadCommandeById(Long idCommande) {
		
		Query req = sessionFactory.getCurrentSession().createQuery(" select c from Commande c where c.id=:id") ;
		req.setParameter("id", idCommande) ;
		return (Commande) req.uniqueResult() ;
		
	}

}
