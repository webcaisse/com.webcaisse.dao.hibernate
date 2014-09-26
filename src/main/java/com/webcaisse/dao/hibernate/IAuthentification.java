package com.webcaisse.dao.hibernate;

import com.webcaisse.dao.hibernate.model.Produit;
import com.webcaisse.dao.hibernate.model.User;

public interface IAuthentification {

	public User getAuthentification(String userName, String password, String codeSociete) ;

}
