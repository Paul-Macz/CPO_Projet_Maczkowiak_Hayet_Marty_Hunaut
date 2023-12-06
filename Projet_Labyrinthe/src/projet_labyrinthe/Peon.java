/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

/**
 *
 * @author lukha
 */
public class Peon {
    private Player associe;
    private String couleur; // couleur du pion (blanc, noir)
    private int position;   // position actuelle du pion sur le plateau

    public Peon(Player user,String couleur, int position) {
        this.associe=user;
        this.couleur = couleur;
        this.position = position;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void deplacer(int decalage) {
        // vérifier que le déplacement est valide
        if (decalage >= 0 && decalage <= 5) {
            this.position += decalage;
        } else {
            System.out.println("Déplacement non valide");
        }
    }
}
    

