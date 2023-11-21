/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.util.ArrayList;

/**
 *
 * @author lukha
 */
public class Case {
    int orientation;
    boolean Haut, Bas, Gauche, Droite; 
    ArrayList<Peon> Players;
    String object;

    /**
     * Créer une case vide, dans une orientation neutre, sans joueur dessus
     * et sans objet et entierement fermée
     * 
     */
    public Case() {
        this.orientation = 0;
        this.Haut = false;
        this.Bas = false;
        this.Gauche = false;
        this.Droite = false;
        this.Players = null;
        this.object = "";
    }
    
    /**
     * Change l'orientation de la case dans le sens trigonométrique
 Par implication, change fais tourner les murs ouverts (Haut,Bas,Gauche,Droite)
     * @param angle Détermine la nouvel orientation de la case, si angle n'est pas un
     * multiple de 90 degrés, la méthode ne fait rien.
     */
    public void TurnCase(int angle){
        if (angle==0){
            return;
        }
        
        if (angle%90==0){
            int direction = angle/90;
            direction= direction%4;
            boolean temp, temp2;
            
            switch (direction) {
                case 1:
                    temp=Haut;
                    Haut=Gauche;
                    Gauche=Bas;
                    Bas=Droite;
                    Droite=temp;
                    orientation=90;
                    break;
                case 2:
                    temp=Haut;
                    Haut=Bas;
                    Bas=Haut;
                    temp2=Gauche;
                    Gauche=Droite;
                    Droite=temp2;
                    orientation=180;
                    break;
                case 3:
                    temp=Haut;
                    Haut=Droite;
                    Droite=Bas;
                    Bas=Gauche;
                    Gauche=temp;
                    orientation=270;
                    break;
                default:
                    break;
            }
        }
    }
    
    
}
