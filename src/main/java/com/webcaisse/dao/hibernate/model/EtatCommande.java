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
@Table(name="commande_workflow")
public class EtatCommande {
	
	private Long id ;
	private String libelle ;
	private String code ;
	
	
	
	@Id
	@GenericGenerator(name="id_etat" , strategy="increment")
	@GeneratedValue(generator="id_etat")
	@Column(name="id_etat")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="code",nullable=true)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="libelle",nullable=true)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	


}
