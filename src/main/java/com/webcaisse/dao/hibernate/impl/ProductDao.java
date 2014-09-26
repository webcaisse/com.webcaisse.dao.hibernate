package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IProductDao;
import com.webcaisse.dao.hibernate.model.Famille;
import com.webcaisse.dao.hibernate.model.Menu;
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
		
		
		Menu m = (Menu) sessionFactory.getCurrentSession().load(Produit.class, idMenu) ;
		p.setMenu(m);
		m.getProduits().add(p);
		sessionFactory.getCurrentSession().save(p) ;
		
		return p.getId();
	}
	
}
