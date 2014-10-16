package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IProductDao;
import com.webcaisse.dao.hibernate.model.Famille;
import com.webcaisse.dao.hibernate.model.Menu;
import com.webcaisse.dao.hibernate.model.Panier;
import com.webcaisse.dao.hibernate.model.Produit;


public class ProductDao  implements IProductDao{

	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Famille> getFamillies (){
		List<Famille>  familles = sessionFactory.getCurrentSession().createCriteria(Famille.class).list();
		
		return familles;
	}
	
	@Transactional
	public Long ajouterProduit(Produit p, Long idMenu) {
		
		
//		Menu m = (Menu) sessionFactory.getCurrentSession().load(Produit.class, idMenu) ;
//		//p.setMenu(m);
//		m.getProduits().add(p);
//		sessionFactory.getCurrentSession().save(p) ;
		
		// l'ajout de produits, familles, etc.. va se faire avec spring batch
		
		return p.getId();
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
	public Panier ajouterProduitAuPanier(Produit p, Long idPanier) {
		
		Panier panier = (Panier) sessionFactory.getCurrentSession().load(Panier.class,idPanier) ;
		p.setPanier(panier);
		panier.getProduits().add(p) ;
		sessionFactory.getCurrentSession().save(p) ;
		
		
		return panier ;
	}
	 
	
	
	 
	
}
