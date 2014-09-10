package com.webcaisse.dao.hibernate.model;

import java.util.List;

public class Menu {

	private Long id;
	
	private List<Produit> produits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
