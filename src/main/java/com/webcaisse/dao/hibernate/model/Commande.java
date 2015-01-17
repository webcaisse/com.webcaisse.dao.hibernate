package com.webcaisse.dao.hibernate.model;

import java.util.Date;
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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cdes")
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
	
	private String etat ;
	
	private Livreur livreur  ;
	

	private List<LigneCommande> ligneCommandes;

	@Id
	@GenericGenerator(name="id_cde" , strategy="increment")
	@GeneratedValue(generator="id_cde")
	@Column(name="id_cde")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="id_client")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	@ManyToOne
	@JoinColumn(name="id_session")
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@ManyToOne
	@JoinColumn(name="id_societe")
	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
	@Column(name="commentaire", nullable=true)
	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	@Column(name="date_cde", nullable=true)
	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	@Column(name="date_prevue", nullable=true)
	public Date getDatePrevue() {
		return datePrevue;
	}

	public void setDatePrevue(Date datePrevue) {
		this.datePrevue = datePrevue;
	}

	@Column(name="mode", nullable=true)
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	@Column(name="montant", nullable=true)
	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	@Column(name="paye", nullable=true)
	public Boolean getPaye() {
		return paye;
	}

	public void setPaye(Boolean paye) {
		this.paye = paye;
	}

	@Column(name="reg_ch", nullable=true)
	public Double getRegCheque() {
		return regCheque;
	}

	public void setRegCheque(Double regCheque) {
		this.regCheque = regCheque;
	}
	
	@Column(name="reg_cb", nullable=true)
	public Double getRegCB() {
		return regCB;
	}

	public void setRegCB(Double regCB) {
		this.regCB = regCB;
	}

	@Column(name="reg_esp", nullable=true)
	public Double getRegEspece() {
		return regEspece;
	}

	public void setRegEspece(Double regEspece) {
		this.regEspece = regEspece;
	}

	@Column(name="reg_fi", nullable=true)
	public Double getRegCarteFidelite() {
		return regCarteFidelite;
	}

	public void setRegCarteFidelite(Double regCarteFidelite) {
		this.regCarteFidelite = regCarteFidelite;
	}
	
	@Column(name="reg_tr", nullable=true)
	public Double getRegTicketRestau() {
		return regTicketRestau;
	}

	public void setRegTicketRestau(Double regTicketRestau) {
		this.regTicketRestau = regTicketRestau;
	}

	@OneToMany(mappedBy="commande", fetch= FetchType.EAGER, cascade=CascadeType.ALL)
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	public String getEtat() {
		return etat;
	}

	@Column(name="etat", nullable=true)
	public void setEtat(String etat) {
		this.etat = etat;
	}

	
	@ManyToOne
	@JoinColumn(name="id_livreur")
	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}
	
	
}
