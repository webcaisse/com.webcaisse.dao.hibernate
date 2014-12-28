package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IProductDao;
import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Famille;
import com.webcaisse.dao.hibernate.model.LigneCommande;
import com.webcaisse.dao.hibernate.model.Produit;


public class ProductDao  implements IProductDao{

	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Famille> getFamillies (Long idSociete){
		
		 Query req = sessionFactory.getCurrentSession().createQuery("select f from Famille f where f.societe.id=:x " ) ;
		 req.setParameter("x", idSociete) ;
		 return req.list() ;
	}
	
	
	@Transactional
	public List<Produit> getProductsByFamilly (Long familleId){
		
		
		 Query req = sessionFactory.getCurrentSession().createQuery("select p from Produit p where p.famille.id=:x " ) ;
		    req.setParameter("x", familleId) ;
		    return req.list() ;
	}
	
	@Transactional
	public Produit loadProductById(Long produitId) {
		
		 Query req = sessionFactory.getCurrentSession().createQuery("select p from Produit p where p.id=:id " ) ;
		 req.setParameter("id", produitId) ;
		 return (Produit) req.uniqueResult() ;
		
	}

	
	@Transactional
	public Long sauvegarderCommande(Commande commande) {
	
			
		return (Long) sessionFactory.getCurrentSession().save(commande) ;
		 /**
		  * l'id retourner a reverifer apres
		  */
	}
	 
	
	@Transactional
	public void ajouterProduit(Produit p) {
		    
	    sessionFactory.getCurrentSession().save(p);
	}


	@Transactional
	public void supprimerProduit(Long idProduit) {
		
		Produit produit = (Produit) sessionFactory.getCurrentSession().get(Produit.class, idProduit) ;
		sessionFactory.getCurrentSession().delete(produit);
		
	}
	
	@Transactional
	public void updateProduit(Produit p) {
		
		Produit produit = (Produit) sessionFactory.getCurrentSession().get(Produit.class, p.getId()) ;
		produit.setLibelle(p.getLibelle());
		produit.setCode(p.getCode());
		    
	    sessionFactory.getCurrentSession().update(produit);
	}

	
	
//	@Transactional
//	public Panier ajouterProduitAuPanier(Produit p, Long idPanier) {
//		
//		Panier panier = (Panier) sessionFactory.getCurrentSession().load(Panier.class,idPanier) ;
//		p.getLibelle();
//		p.getPrix();
//		panier.getProduits().add(p) ;
//		sessionFactory.getCurrentSession().save(panier) ;
//		
//		
//		return panier ;
//	}
	 
	
	
	 
	
}
