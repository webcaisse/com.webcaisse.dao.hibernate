package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Reference;
import com.webcaisse.dao.hibernate.model.User;

public interface IParametreDao {

	
	void sauvgarderParametre (Reference reference) ;
	public Reference getReferenceByName (String referenceName);
	void sauvegarderUser (User user) ;
	public  List<User> rechercherUser(Long idSociete) ;
	public List<Reference> getHeaderReferences (Long idSociete) ;
	public List<Reference> getFootersReferences (Long idSociete ) ;
	
	
}
