package com.webcaisse.dao.hibernate.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="menu")
public class Menu {

	private Long id;
	
	private List<Produit> produits;

	@Id
	@GenericGenerator(name="id_menu" , strategy="increment")
	@GeneratedValue(generator="id_menu")
	@Column(name="id_menu")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(mappedBy="menu")
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
