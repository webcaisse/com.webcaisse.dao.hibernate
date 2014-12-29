package com.webcaisse.dao.hibernate.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IParametreDao;
import com.webcaisse.dao.hibernate.model.Reference;

public class ParametreDao implements IParametreDao{

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public void sauvgarderParametre(Reference reference) {
		
		sessionFactory.getCurrentSession().save(reference) ;
	}

	
	
}
