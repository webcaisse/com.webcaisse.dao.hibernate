package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.EtatCommande;

public interface ICommandeDao {
	
	public Commande loadCommandeById(Long idCommande) ;
	public void updateCommande(Commande commande) ;
	public List<Commande> getCommandesByIdLivreur(Long idLivreur) ;
	public List<Commande> getCommandesByEtat(String  etatCommande) ;
	public EtatCommande loadEtatCommandeByCode(String code) ;
	
	

}
