package com.webcaisse.dao.hibernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="session")
public class Session {

	private Long id;
	
	private Double chiffreAffaire;
	
	private Date dateFermeture ;
	
	private Date dateOuverture;
	
	private Character etat;
	
	private User user ;

	
	@Id
	@GenericGenerator(name="id_session" , strategy="increment")
	@GeneratedValue(generator="id_session")
	@Column(name="id_session")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="chiffre_aff", nullable=true)
	public Double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(Double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	@Column(name="date_fermeture", nullable=true)
	public Date getDateFermeture() {
		return dateFermeture;
	}

	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}

	@Column(name="date_ouverture", nullable=true)
	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	@Column(name="etat", nullable=true)
	public Character getEtat() {
		return etat;
	}

	public void setEtat(Character etat) {
		this.etat = etat;
	}

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_user")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
