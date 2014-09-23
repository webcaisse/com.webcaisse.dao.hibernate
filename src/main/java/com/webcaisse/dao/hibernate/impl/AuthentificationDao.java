package com.webcaisse.dao.hibernate.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.model.User;

public class AuthentificationDao {

	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public List<User> getAuthentification(){
	
		Query req = sessionFactory.getCurrentSession().createQuery("select username,password,s.code_societe from users u inner join societe s on u.id_societe=s.id_societe" ) ;
	     return  req.list() ;
	    
	
}

}