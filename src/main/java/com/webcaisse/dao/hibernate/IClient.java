package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Client;


public interface IClient {

	
	public  List<Client> rechercherClient(Long idSociete) ;
	public void ajouterClient(Client client );
	public Client loadClientById(Long idClient) ;
	public void supprimerClient(Long idClient) ;
	public void updateClient(Client client) ;
	public List<Client> autoCompleteClient (String param) ;
}
