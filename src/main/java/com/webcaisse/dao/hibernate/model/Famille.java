package com.webcaisse.dao.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="familles")
public class Famille {

	private Long id;
	
	private String libelle;
	
	private Societe societe ;

	@Id
	@GenericGenerator(name="id_famille" , strategy="increment")
	@GeneratedValue(generator="id_famille")
	@Column(name="id_famille")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="libelle", nullable=true)
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	} 
}
