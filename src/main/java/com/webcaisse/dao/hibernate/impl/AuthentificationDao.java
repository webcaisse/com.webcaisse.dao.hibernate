package com.webcaisse.dao.hibernate.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IAuthentification;
import com.webcaisse.dao.hibernate.model.User;

public class AuthentificationDao implements IAuthentification {

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;

	@Transactional
	public User getAuthentification(String userName, String password, String codeSociete) {

		
		return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
		.add(Restrictions.eq("nom", userName))
		.add(Restrictions.eq("codeAcces", password))
		.createCriteria("societe")
		.add(Restrictions.eq("nom", codeSociete)).uniqueResult();

	}

	@Transactional
	public User finByUserName(String userName) {
		
		 Query req = sessionFactory.getCurrentSession().createQuery("select u from User u where u.username=:username " ) ;
		 req.setParameter("username", userName) ;
		
		 return  (User) req.uniqueResult() ;
	
	}

	
	
}