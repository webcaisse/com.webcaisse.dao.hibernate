package com.webcaisse.dao.hibernate.model;

public class Famille {

	private Long id;
	
	private String libelle;
	
	private Societe societe ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	} 
	
	
}
