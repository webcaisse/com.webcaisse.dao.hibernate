package com.webcaisse.dao.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="users")
public class User {

	private Long id;
	

	private Boolean actif;
	
	private String adresse;
	
	private String codeAcces ;

	private String nom ;
	
	private String password ;
	
	private String username;
	
	private String prenom ;
	
	private String telephone ;

	private Societe societe ;
	
	@Id
	@GenericGenerator(name="id_user" , strategy="increment")
	@GeneratedValue(generator="id_user")
	@Column(name="id_user")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="actif", nullable=true)
	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	@Column(name="adresse", nullable=true)
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name="code", nullable=true)
	public String getCodeAcces() {
		return codeAcces;
	}

	public void setCodeAcces(String codeAcces) {
		this.codeAcces = codeAcces;
	}

	@Column(name="nom", nullable=true)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name="username",nullable=true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password",nullable=true)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Column(name="prenom", nullable=true)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name="telephone_portable", nullable=true)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@ManyToOne
	@JoinColumn(name="id_societe", insertable=false, updatable=false)
	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
}