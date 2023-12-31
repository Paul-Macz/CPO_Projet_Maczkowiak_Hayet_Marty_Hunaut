/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.util.ArrayList;

/**
 *
 * @authors Owen HAYET, Raphael MARTY, Oscar HUNAUT, Paul MACZKOWIAK
 */
public class Case {

    int orientation;
    boolean Haut, Bas, Gauche, Droite;
    ArrayList<Peon> Players;
    String object;

    /**
     * Créer une case vide, dans une orientation neutre, sans joueur dessus et
     * sans objet et entierement fermée
     *
     */
    public Case(String casechoisie) {
        this.orientation = 0;
        this.Haut = false;
        this.Bas = false;
        this.Gauche = false;
        this.Droite = false;
        this.Players = new ArrayList<>();
        this.object = casechoisie;
    }

    /**
     * Change l'orientation de la case dans le sens trigonométrique Par
     * implication, change fais tourner les murs ouverts
     * (Haut,Bas,Gauche,Droite)
     *
     * @param angle Détermine la nouvel orientation de la case, si angle n'est
     * pas un multiple de 90 degrés, la méthode ne fait rien.
     */
    public void TurnCase(int angle) {
        if (angle == 0) {
            return;
        }

        if (angle % 90 == 0) {
            
            orientation += angle;
            orientation = orientation % 360;
            for (int i = 0; i < angle / 90; i++) {
                //System.out.println(this);
                boolean temp;
                temp = Haut;
                Haut = Gauche;
                Gauche = Bas;
                Bas = Droite;
                Droite = temp;
            }

        }
    }
    
    /**
     * Reinitialise la case 
     */
    public void reset(){
        while(orientation!=0){
            TurnCase(90);
        }
    }

    @Override
    public String toString() {
        return "Case{" + "orientation=" + orientation + ", Haut=" + Haut + ", Bas=" + Bas + ", Gauche=" + Gauche + ", Droite=" + Droite + ", Players=" + Players + ", object=" + object + '}';
    }

    /**
     * Détermine si un objet est présent sur la tuile (c-à-d si la tuile n'est
     * pas une tuile de départ ou un tuile vide (type 'droit' ou 'coin'))
     *
     * @return Si la tuile a un objet
     */
    public boolean presenceObjet() {
        return !(object.equals("departB")
                || object.equals("departV")
                || object.equals("departJ")
                || object.equals("departR")
                || object.equals("tuile1")
                || object.equals("tuile2"));
    }

    /**
     * Détermine si des pions sont présents sur la tuile (ou un seul)
     *
     * @return Si la case a des pions
     */
    public boolean presenceJoueurs() {
        return !(Players == null || Players.isEmpty());
    }

}
