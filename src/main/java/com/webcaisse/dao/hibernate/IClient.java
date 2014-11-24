package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Client;


public interface IClient {

	
	public  List<Client> rechercherClient(Long idSociete) ;
}
