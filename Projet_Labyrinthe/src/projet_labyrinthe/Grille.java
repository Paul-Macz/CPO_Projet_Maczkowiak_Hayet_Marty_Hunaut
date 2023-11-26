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
public class Grille {
    Case[][] Grid;
    Case prochainecase;
    /**
     * Créer une nouvelle grille de cases en 7x7
     */
    public Grille(){
        Grid = new Case[7][7];
    }
    
    /**
     * Place sur la grille une case souhaitée
     * @param x              Détermine sa position horizontale
     * @param y              Détermine sa postion verticale
     * @param CaseChoisie    Détermine la case souhaitée
     */
    public void PlaceCase(int x,int y, Case CaseChoisie){
        if (Grid[x][y]==null){
            Grid[x][y]= CaseChoisie;
        }
    }

    /**
     * Déplace l'ensemble des cases de la ligne dans une direction
     * @param LigneNb Determine la ligne modifiée
     * @param Droite  Determine si on se déplace vers la droite ou vers la gauche
     * @return        Renvoie le succès de l'opération
     */
    public boolean DecalerLigne(int LigneNb, boolean Droite){
        if (LigneNb<0 || LigneNb>6){
            return false;
        }
        Case temp;
        int direction;
        if (Droite){
            temp=Grid[LigneNb][6];
            direction=1;
        }
        else {
            temp=Grid[LigneNb][0];
            direction=-1;
        }
        for (int i=0;i<7;i++){
            int j;
            if (Droite){
                j=6-i;
            }
            else{
                j=i;
            }
            if (i==6){
                Grid[LigneNb][j]=prochainecase;
                Grid[LigneNb][j].Players=new ArrayList<>(temp.Players);
                temp.Players.clear();      
            }
            else{
                Grid[LigneNb][j]=Grid[LigneNb][j-direction];
            }
        }
        return true;
    }
}
