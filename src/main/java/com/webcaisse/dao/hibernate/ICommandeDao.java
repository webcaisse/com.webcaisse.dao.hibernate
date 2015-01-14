package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;

public interface ICommandeDao {
	
	public Commande loadCommandeById(Long idCommande) ;
	public void updateCommande(Commande commande) ;
	public List<Commande> getCommandesByIdLivreur(Long idLivreur) ;
	

}
