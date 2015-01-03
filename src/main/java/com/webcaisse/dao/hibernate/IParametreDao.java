package com.webcaisse.dao.hibernate;

import com.webcaisse.dao.hibernate.model.Reference;

public interface IParametreDao {

	
	void sauvgarderParametre (Reference reference) ;
	
	Reference getReferenceByName (String referenceName);
	
	
}
