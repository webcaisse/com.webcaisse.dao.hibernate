package com.webcaisse.dao.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="profils")
public class Profil {

	private Integer id;
	
	private String libelle;

	@Id
	@GenericGenerator(name="id_profil" , strategy="increment")
	@GeneratedValue(generator="id_profil")
	@Column(name="id_profil")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="nom_profil")
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
