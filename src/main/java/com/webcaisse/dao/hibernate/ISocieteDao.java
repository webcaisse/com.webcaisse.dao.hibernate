package com.webcaisse.dao.hibernate;

import com.webcaisse.dao.hibernate.model.Societe;

public interface ISocieteDao {

	public Societe loadById (Long societeId);

}
