package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ICommandeDao;
import com.webcaisse.dao.hibernate.model.Client;
import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.EtatCommande;
import com.webcaisse.dao.hibernate.model.Livreur;


public class CommandeDao implements ICommandeDao {

	
	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public Commande loadCommandeById(Long idCommande) {
		
		Query req = sessionFactory.getCurrentSession().createQuery(" select c from Commande c where c.id=:id") ;
		req.setParameter("id", idCommande) ;
		return (Commande) req.uniqueResult() ;
		
	}

	
	@Transactional

	public void updateCommande(Commande commande) {
		
		Commande c= (Commande) sessionFactory.getCurrentSession().load(Commande.class,commande.getId()) ;
		  c.setLivreur(commande.getLivreur());
		  c.setEtatCommande(commande.getEtatCommande());
		 
		  sessionFactory.getCurrentSession().update(c);
		
	}

	@Transactional
	public List<Commande> getCommandesByIdLivreur(Long idLivreur) {
		
		Query req = sessionFactory.getCurrentSession().createQuery(" select c from Commande c where c.livreur.id=:id") ;
		req.setParameter("id", idLivreur) ;
		return req.list() ;
	}

   @Transactional
	public List<Commande> getCommandesByEtat(String etatCommande) {
		
		Query req = sessionFactory.getCurrentSession().createQuery(" select c from Commande c where c.etatCommande.code=:code") ;
		req.setParameter("code", etatCommande) ;
		return req.list() ;
		
	}

   @Transactional
public EtatCommande loadEtatCommandeByCode(String code) {
	
	Query query=sessionFactory.getCurrentSession().createQuery("select e from EtatCommande e where e.code=:x");
	query.setParameter("x",code) ;
	
	
	return (EtatCommande) query.uniqueResult();
}

}
