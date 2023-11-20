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
    boolean North, South, East, West; 
    ArrayList<Peon> Players;
    String object;

    /**
     * Créer une case vide, dans une orientation neutre, sans joueur dessus
     * et sans objet et entierement fermée
     * 
     */
    public Case() {
        this.orientation = 0;
        this.North = false;
        this.South = false;
        this.East = false;
        this.West = false;
        this.Players = null;
        this.object = "";
    }
    
    /**
     * Change l'orientation de la case dans le sens trigonométrique
     * Par implication, change fais tourner les murs ouverts (North,South,East,West)
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
                    temp=North;
                    North=East;
                    East=South;
                    South=West;
                    West=temp;
                    orientation=90;
                    break;
                case 2:
                    temp=North;
                    North=South;
                    South=North;
                    temp2=East;
                    East=West;
                    West=temp2;
                    orientation=180;
                    break;
                case 3:
                    temp=North;
                    North=West;
                    West=South;
                    South=East;
                    East=temp;
                    orientation=270;
                    break;
                default:
                    break;
            }
        }
    }
    
    
}
