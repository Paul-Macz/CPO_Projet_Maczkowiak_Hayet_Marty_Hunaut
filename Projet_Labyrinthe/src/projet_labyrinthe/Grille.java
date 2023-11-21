/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

/**
 *
 * @author lukha
 */
public class Grille {
    Case[][] Cases;
    
    public Grille(){
        Cases = new Case[7][7];
    }
    
    public void PlaceCase(int x,int y, Case CaseChoisie){
        if (Cases[x][y]==null){
            Cases[x][y]= CaseChoisie;
        }
    }
}
