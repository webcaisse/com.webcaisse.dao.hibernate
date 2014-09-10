package com.webcaisse.dao.hibernate.model;

import java.util.Date;

public class Session {

	private Long id;
	
	private Double chiffreAffaire;
	
	private Date dateFermeture ;
	
	private Date dataOuverture;
	
	private Character etat;
	
	private Societe societe ;
	
	private User user ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(Double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Date getDateFermeture() {
		return dateFermeture;
	}

	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}

	public Date getDataOuverture() {
		return dataOuverture;
	}

	public void setDataOuverture(Date dataOuverture) {
		this.dataOuverture = dataOuverture;
	}

	public Character getEtat() {
		return etat;
	}

	public void setEtat(Character etat) {
		this.etat = etat;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
