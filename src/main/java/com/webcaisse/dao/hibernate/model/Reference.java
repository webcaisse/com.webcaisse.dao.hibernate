package com.webcaisse.dao.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="reference")
public class Reference {

	private Long id;
	
	private Long idSociete;
	
	private Date dateCrea;
	
	private Date dateModif;
	
	private String valeur ;
	
	private String nomParametre;

	@Id
	@GenericGenerator(name="id_ref" , strategy="increment")
	@GeneratedValue(generator="id_ref")
	@Column(name="id_ref")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="id_societe")	
	public Long getIdSociete() {
		return idSociete;
	}

	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}

	@Column(name="date_crea", nullable=true)
	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	@Column(name="date_modif", nullable=true)
	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	@Column(name="valeur", nullable=true)
	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Column(name="nom_parametre", nullable=true)
	public String getNomParametre() {
		return nomParametre;
	}

	public void setNomParametre(String nomParametre) {
		this.nomParametre = nomParametre;
	}
	
}

