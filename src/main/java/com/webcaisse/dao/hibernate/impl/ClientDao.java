package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.webcaisse.dao.hibernate.IClient;
import com.webcaisse.dao.hibernate.model.Client;


public class ClientDao implements IClient {

	
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public List<Client> rechercherClient(Long idSociete) {
		
			 Query req = sessionFactory.getCurrentSession().createQuery("select c from Client c where c.societe.id=:x " ) ;
			    req.setParameter("x", idSociete) ;
			    return req.list() ;
		
	}

}
