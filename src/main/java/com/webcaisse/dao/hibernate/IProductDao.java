package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Famille;
import com.webcaisse.dao.hibernate.model.Produit;


public interface IProductDao {

	public List<Famille> getFamillies ( Long idSociete);
	public Long ajouterProduit(Produit p, Long idMenu) ;
	public List<Produit> getProductsByFamilly (Long familleId);
	public Produit loadProductById (Long produitId);
	//public Panier ajouterProduitAuPanier(Produit p, Long idPanier) ;
	public Long sauvegarderCommande(Commande  commande) ;
	
}
