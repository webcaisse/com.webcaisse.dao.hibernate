package com.webcaisse.dao.hibernate;

import java.util.Date;
import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Session;

public interface ISessionDao {

	
	public Session loadSessionById(Long sessionId);
	public  List<Commande> rechercherCommande(Long idSession) ;
	public List<Commande> rechercherCommandeParDate(Long idSociete ,Date dateCommade) ;
	public List<Session> getSessionByUserIdAndDate(Long idUser,Date date) ;
	public Long creerSession(Long idUser,Date date) ;
	public void updateSession(Session session);
	
}
