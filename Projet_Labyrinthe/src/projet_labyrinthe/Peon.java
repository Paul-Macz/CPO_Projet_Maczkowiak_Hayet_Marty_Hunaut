/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

/**
 *
 * @authors Owen HAYET, Raphael MARTY, Oscar HUNAUT, Paul MACZKOWIAK
 */
public class Peon {
    Player associe;
    String couleur; 
    int position;  

    /**
     * Creer un pion
     * @param user  Le joueur associé
     * @param couleur  La couleur du pion
     * @param position La position du pion dans la grille
     */
    public Peon(Player user, String couleur, int position) {
        this.associe = user;
        this.couleur = couleur;
        this.position = position;
    }

    /**
     * Retourne la couleur du pion
     * @return la couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Retourne la position du pion
     * @return la position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Fixe la position du pion
     * @param position la nouvelle position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Deplace la position du pion dans la grille
     * @param decalage décalage du pion
     */
    public void deplacer(int decalage) {
        // vérifier que le déplacement est valide
        if (decalage >= 0 && decalage <= 5) {
            this.position += decalage;
        } else {
            System.out.println("Déplacement non valide");
        }
    }
}
    

