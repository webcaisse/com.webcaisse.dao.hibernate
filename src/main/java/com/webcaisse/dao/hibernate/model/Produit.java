package com.webcaisse.dao.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="produits")
public class Produit {

	private Long id;
	
	private String libelle;
	
	private List<Prix> prix ;
	
	private Integer qteStock;
	
	private String description;
	
	private Famille famille;
	
	private String couleur ;
	
	

	
	@Id
	@GenericGenerator(name="id_produit" , strategy="increment")
	@GeneratedValue(generator="id_produit")
	@Column(name="id_produit")
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

	@OneToMany(mappedBy="produit", fetch= FetchType.EAGER)
	public List<Prix> getPrix() {
		return prix;
	}

	public void setPrix(List<Prix> prix) {
		this.prix = prix;
	}

	@Column(name="qte", nullable=true)
	public Integer getQteStock() {
		return qteStock;
	}

	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}

	@Column(name="description", nullable=true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	@JoinColumn(name="id_famille")
	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	
	@Column(name="color", nullable=true)
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	public Menu getMenu() {
//		return menu;
//	}
//
//	public void setMenu(Menu menu) {
//		this.menu = menu;
//	}

	//TODO a faire lors de la gestion des menus 
	
}
