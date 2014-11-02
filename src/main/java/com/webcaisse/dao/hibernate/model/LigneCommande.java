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
@Table(name="cdes_lines")
public class LigneCommande {
	
	private Long id;

	private Commande commande;
	
	private String format;
	
	private String details;
	
	private String notes;
	
	private Boolean offert ;
	
	private Double prix ;
	
	private Integer qte;
	
	private Double totale;
	
	private Produit produit;

	@Id
	@GenericGenerator(name="id_line" , strategy="increment")
	@GeneratedValue(generator="id_line")
	@Column(name="id_line")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Column(name="format", nullable=true)
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Column(name="details", nullable=true)
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	@Column(name="notes", nullable=true)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name="offert", nullable=true)
	public Boolean getOffert() {
		return offert;
	}

	public void setOffert(Boolean offerts) {
		this.offert = offerts;
	}

	@Column(name="prix", nullable=true)
	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	@Column(name="qte", nullable=true)
	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer integer) {
		this.qte = integer;
	}

	@Column(name="total", nullable=true)
	public Double getTotale() {
		return totale;
	}

	public void setTotale(Double totale) {
		this.totale = totale;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
}
