package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IParametreDao;
import com.webcaisse.dao.hibernate.model.Reference;
import com.webcaisse.dao.hibernate.model.User;

public class ParametreDao implements IParametreDao {

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;

	@Transactional
	public void sauvgarderParametre(Reference reference) {

		sessionFactory.getCurrentSession().saveOrUpdate(reference);
	}
	
	@Transactional
	public Reference getReferenceByName(String referenceName) {
		Query req = sessionFactory.getCurrentSession().createQuery(
				"select ref from Reference ref where ref.nomParametre=:x ");
		req.setParameter("x", referenceName);
		return (Reference) req.uniqueResult();

	}

	
	@Transactional
	public void sauvegarderUser(User user) {
		 sessionFactory.getCurrentSession().save(user) ;
		
	}

	@Transactional
	public List<User> rechercherUser(Long idSociete) {
		
		Query req = sessionFactory.getCurrentSession().createQuery("select u from User u where u.societe.id=:x ");
		req.setParameter("x", idSociete);
		return req.list();
		
		
		
	}

	
	
}
