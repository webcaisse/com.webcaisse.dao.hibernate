package com.webcaisse.dao.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="panier")
public class Panier {
	
	@Id
	@GeneratedValue
	private Long id ;
	private List<Produit> produits ;
	private Integer qte ;
	private Float remise ;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	
	@OneToMany(mappedBy="panier")
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Float getRemise() {
		return remise;
	}
	public void setRemise(Float remise) {
		this.remise = remise;
	}
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panier(List<Produit> produits, Integer qte, Float remise) {
		super();
		this.produits = produits;
		this.qte = qte;
		this.remise = remise;
	}



}
