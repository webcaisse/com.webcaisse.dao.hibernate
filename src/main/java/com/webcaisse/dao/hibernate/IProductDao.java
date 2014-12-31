package com.webcaisse.dao.hibernate;

import java.util.List;

import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Famille;
import com.webcaisse.dao.hibernate.model.Produit;


public interface IProductDao {

	public List<Famille> getFamillies ( Long idSociete);
	public void ajouterProduit(Produit p) ;
	public List<Produit> getProductsByFamilly (Long familleId);
	public Produit loadProductById (Long produitId);
	public Famille loadFamilleById(Long IdFamille ) ;
	//public Panier ajouterProduitAuPanier(Produit p, Long idPanier) ;
	public Long sauvegarderCommande(Commande  commande) ;
	public void supprimerProduit(Long idProduit);
	public void updateProduit(Produit p) ;
	public void ajouterFamille(Famille famille) ;
	public void supprimerFamille(Long idFamille) ;
	public void updateFamille(Famille f) ;
}
