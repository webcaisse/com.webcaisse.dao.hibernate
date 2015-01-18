package com.webcaisse.dao.hibernate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.IClient;
import com.webcaisse.dao.hibernate.model.Client;

public class ClientDao implements IClient {

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory;

	@Transactional
	public List<Client> rechercherClient(Long idSociete) {

		Query req = sessionFactory.getCurrentSession().createQuery(
				"select c from Client c where c.societe.id=:x ");
		req.setParameter("x", idSociete);
		return req.list();

	}
	
	
	@Transactional
	public void ajouterClient(Client client )
	{
		
		sessionFactory.getCurrentSession().save(client) ;
	}

	
	@Transactional
	public Client loadClientById(Long idClient)
	{
		Query req = sessionFactory.getCurrentSession().createQuery("select c from Client c where c.id=:id " ) ;
		 req.setParameter("id", idClient) ;
		 return (Client) req.uniqueResult() ;
		
		
	}

@Transactional
	public void supprimerClient(Long idClient) {
		Client c= (Client) sessionFactory.getCurrentSession().load(Client.class, idClient) ;
		sessionFactory.getCurrentSession().delete(c);
		
		
	}

@Transactional
     public void updateClient(Client client) {
	
	Client c= (Client) sessionFactory.getCurrentSession().load(Client.class,client.getId()) ;
	  c.setNom(client.getNom());
	  c.setPrenom(client.getPrenom());
	  c.setEmail(client.getEmail());
	  c.setTelephone(client.getTelephone());
	  sessionFactory.getCurrentSession().update(c);
	  
	  
	
}

@Transactional
public List<Client> autoCompleteClient(String param) {
   
	Query req = sessionFactory.getCurrentSession().createQuery("select c from Client c where c.telephone like :param"  ) ;
	req.setParameter("param", "%"+param+"%");
	 return req.list() ;
}
}
