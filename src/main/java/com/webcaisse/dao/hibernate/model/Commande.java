package com.webcaisse.dao.hibernate.model;

import java.util.Date;

public class Commande {

	
	private Long id;
	
	private Client client ;
	
	private Session session;
	
	private Societe societe ;
	
	private String commentaire ;
	
	private Date dateCommande;

	private Date datePrevue;
	
	private String mode;
	
	private Double montant ;
	
	private Boolean paye;
	
	private Double regCheque;
	
	private Double regCB;
	
	private Double regEspece;
	
	private Double regCarteFidelite;
	
	private Double regTicketRestau;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDatePrevue() {
		return datePrevue;
	}

	public void setDatePrevue(Date datePrevue) {
		this.datePrevue = datePrevue;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Boolean getPaye() {
		return paye;
	}

	public void setPaye(Boolean paye) {
		this.paye = paye;
	}

	public Double getRegCheque() {
		return regCheque;
	}

	public void setRegCheque(Double regCheque) {
		this.regCheque = regCheque;
	}

	public Double getRegCB() {
		return regCB;
	}

	public void setRegCB(Double regCB) {
		this.regCB = regCB;
	}

	public Double getRegEspece() {
		return regEspece;
	}

	public void setRegEspece(Double regEspece) {
		this.regEspece = regEspece;
	}

	public Double getRegCarteFidelite() {
		return regCarteFidelite;
	}

	public void setRegCarteFidelite(Double regCarteFidelite) {
		this.regCarteFidelite = regCarteFidelite;
	}

	public Double getRegTicketRestau() {
		return regTicketRestau;
	}

	public void setRegTicketRestau(Double regTicketRestau) {
		this.regTicketRestau = regTicketRestau;
	}
	
	
	
}
