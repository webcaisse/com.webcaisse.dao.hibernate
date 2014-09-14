package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Famille;

public interface IProductDao {

	public List<Famille> getFamillies ();
}
