/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import projet_labyrinthe.Peon ;
import projet_labyrinthe.Player;
/**
 *
 * @author owenh
 */
public class Player {
    String nom;
	String couleur;
	String[] listeObjets;
	Cartes[] listeCartes;
	int indexCarteRetournee;
	Peon marqueur;

	Player(String nom_joueur, int nombre_cartes) {
		nom = nom_joueur;
		listeObjets = new String[nombre_cartes];
		listeCartes = new Cartes[nombre_cartes];
		indexCarteRetournee = 0;
		marqueur = new Peon(this, couleur , 0);
	}

	public void attribuerCouleur(String couleurAttribuee) {
		couleur = couleurAttribuee;
		marqueur.couleur = couleurAttribuee;
	}
         public void setPositionMarqueur(int position) {
                 marqueur.setPosition(position);
    }
}
