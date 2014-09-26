package com.webcaisse.dao.hibernate.impl;

import javax.annotation.Resource;

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
//		Session session = ((SessionFactory) sessionFactory.getCurrentSession())
//				.openSession();
//
//		Query req = session.createQuery("select username,password,s.code_societe from users u inner join societe s on u.id_societe=s.id_societe");
//		session.beginTransaction();
//
//		return req.list();
		
		return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
		.add(Restrictions.eq("nom", userName))
		.add(Restrictions.eq("codeAcces", password))
		.createCriteria("societe")
		.add(Restrictions.eq("nom", codeSociete)).uniqueResult();

	}

}