package com.webcaisse.dao.hibernate.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="clients")
public class Client {

	private Long id; 
	
	private Societe societe ;
	
	private String code1;
	
	private String code2;
	
	private String code3;
	
	private String codePostale;
	
	private Date dateCreation;
	
	private Integer etage ;
	
	private String immeuble;
	
	private String interphone ;
	
	private String nom;
	
	private String prenom;
	
	private String nomVoie ;
	
	private String numeroRue;
	
	private String notes;
	
	private Long points ;
	
	private String telephone;
	
	private String ville ;
	
	private String zone;
	
	@Id
	@GenericGenerator(name="id_client" , strategy="increment")
	@GeneratedValue(generator="id_client")
	@Column(name="id_client")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="id_societe")
	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@Column(name="code1", nullable=true)
	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	@Column(name="code2", nullable=true)
	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	@Column(name="code3", nullable=true)
	public String getCode3() {
		return code3;
	}

	public void setCode3(String code3) {
		this.code3 = code3;
	}

	@Column(name="cp", nullable=true)
	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	
	@Column(name="date_creat", nullable=true)
	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Column(name="etage", nullable=true)
	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
	}

	@Column(name="immeuble", nullable=true)
	public String getImmeuble() {
		return immeuble;
	}

	public void setImmeuble(String immeuble) {
		this.immeuble = immeuble;
	}
		
	@Column(name="interphone", nullable=true)
	public String getInterphone() {
		return interphone;
	}

	public void setInterphone(String interphone) {
		this.interphone = interphone;
	}
	
	@Column(name="nom", nullable=true)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name="prenom", nullable=true)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Column(name="nom_voie", nullable=true)
	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	@Column(name="num_rue", nullable=true)
	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	@Column(name="notes_livreur", nullable=true)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Column(name="pts", nullable=true)
	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	@Column(name="telephone", nullable=true)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name="ville", nullable=true)
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	@Column(name="zone", nullable=true)
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
}
