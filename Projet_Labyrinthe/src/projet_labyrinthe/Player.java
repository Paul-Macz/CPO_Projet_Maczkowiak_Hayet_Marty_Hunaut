/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.util.Arrays;
import projet_labyrinthe.Peon;
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
        marqueur = new Peon(this, couleur, 0);
    }

    /**
     * Attribue une couleur au joueur
     * @param couleurAttribuee
     */
    public void attribuerCouleur(String couleurAttribuee) {
        couleur = couleurAttribuee;
        marqueur.couleur = couleurAttribuee;
    }

    /**
     * Fixe la position du pion 
     * @param position
     */
    public void setPositionMarqueur(int position) {
        marqueur.setPosition(position);
    }

    /**
     * Détermine si le joueur atteint l'objet a ramasser
     *
     * @param nouvelleCase La nouvelle tuile sur laquelle le pion du joueur est
     */
    public void nouvellePosition(Case nouvelleCase) {
        if (nouvelleCase.presenceObjet()) {
            System.out.print("Cartes:"+listeCartes[indexCarteRetournee].nomObjet+" Case:"+nouvelleCase.object);
            if (listeCartes[indexCarteRetournee].nomObjet.equals(nouvelleCase.object)) {
                ramasserObjet(nouvelleCase);
                indexCarteRetournee++;
            }
        }
    }

    /**
     * Ajoute l'objet présent sur la tuile à la liste des objets possédés par le
     * joueur.
     *
     * @param case1 La tuile sur laquelle le joueur est
     *
     * @return Succès de l'opération
     */
    public boolean ramasserObjet(Case case1) {
        /* Si l'inventaire est plein, on ne peut pas ajouter d'objet dedans. */
        if (sacEstPlein()) {
            return false;
        }
        /* On ne peut pas ajouter d'objet qui n'existe pas */
        if (!case1.presenceObjet()) {
            return false;
        }
        listeObjets[indexCarteRetournee] = case1.object;
        return true;
    }

    /**
     * Vérifie si le sac du joueur (son attribut 'listeObjets') est plein.
     *
     * @return Le remplissage du sac
     */
    public boolean sacEstPlein() {
        for (int i = 0; i < listeObjets.length; i++) {
            if (listeObjets[i] == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Détermine si le joueur a collecté tous ses objets de quête
     *
     * @return Si tous les objets ont été ramassés
     */
    public boolean tousObjetsRamasses() {
        if (!sacEstPlein()) {
            return false;
        }
        if (listeObjets.length < listeCartes.length) {
            return false;
        }
        for (Cartes carte : listeCartes) {
            /*
			On retourne faux si l'objet d'une des cartes recherchées n'est pas contenu dans listeObjets
             */
            if (!Arrays.asList(listeObjets).contains(carte.nomObjet)) {
                return false;
            }
        }
        return true;
    }
}
