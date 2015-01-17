package com.webcaisse.dao.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="livreurs")
public class Livreur {

	
	private Long id;
	
	private Societe societe ;
	
	private String adresse;
	
	private String nom;
	
	private String prenom;
	
	private String nss;
	
	private String telephone ;
	
	

	@Id
	@GenericGenerator(name="id_livreur" , strategy="increment")
	@GeneratedValue(generator="id_livreur")
	@Column(name="id_livreur")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="id_societe")
	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@Column(name="adresse", nullable=true)
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Column(name="nom", nullable=true)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name="prenom", nullable=true)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name="nss", nullable=true)
	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	@Column(name="portable", nullable=true)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	
}
