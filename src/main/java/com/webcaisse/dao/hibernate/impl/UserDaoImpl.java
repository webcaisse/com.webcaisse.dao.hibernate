package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.webcaisse.dao.hibernate.IUserDao;
import com.webcaisse.dao.hibernate.model.Profil;

public class UserDaoImpl implements IUserDao {

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;

	public List<Profil> getProfils() {
		Query req = sessionFactory.getCurrentSession().createQuery(
				"select prof from Profil prof");
		return req.list();

	}

}
