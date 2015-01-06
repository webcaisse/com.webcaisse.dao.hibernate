package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Profil;

public interface IUserDao {

	List<Profil> getProfils();
}
