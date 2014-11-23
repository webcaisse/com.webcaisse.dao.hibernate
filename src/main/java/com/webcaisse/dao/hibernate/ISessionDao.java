package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Session;

public interface ISessionDao {

	
	public Session loadSessionById(Long sessionId);
	public  List<Commande> rechercherCommande(Long idSession) ;
	
}
