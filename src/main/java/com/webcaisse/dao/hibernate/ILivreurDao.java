package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Livreur;
import com.webcaisse.dao.hibernate.model.User;


public interface ILivreurDao {
	
	void sauvegarderLivreur (Livreur livreur) ;
	public  List<Livreur> rechercherLivreur(Long idSociete) ;
	public Livreur loadLivreurById(Long idLivreur) ;
	

}
