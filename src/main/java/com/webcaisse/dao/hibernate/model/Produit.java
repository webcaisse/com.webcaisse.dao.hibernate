package com.webcaisse.dao.hibernate.model;

import java.util.List;

public class Produit {

	private Long id;
	
	private Societe societe;
	
	private String libelle;
	
	private List<Prix> prix ;
	
	private Integer qteStock;
	
	private String description;
	
	private Famille famille;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Prix> getPrix() {
		return prix;
	}

	public void setPrix(List<Prix> prix) {
		this.prix = prix;
	}

	public Integer getQteStock() {
		return qteStock;
	}

	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	
}
