package com.webcaisse.dao.hibernate;

import com.webcaisse.dao.hibernate.model.Commande;

public interface ICommandeDao {
	
	Commande loadCommandeById(Long idCommande) ;

}
