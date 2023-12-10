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
            temp=Grid[LigneNb-1][6];
            direction=1;
        }
        else {
            temp=Grid[LigneNb-1][0];
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
                Grid[LigneNb-1][j]=prochainecase;
                //Grid[LigneNb-1][j].Players=new ArrayList<>(temp.Players);
                //temp.Players.clear();      
            }
            else{

                Grid[LigneNb-1][j]=Grid[LigneNb-1][j-direction];
            }
        }
        return true;
    }
    
    /**
     * Déplace l'ensemble des cases de la colonne dans une direction
     * @param ColNb Determine la colonne modifiée
     * @param Haut  Determine si le déplacement provient du haut
     * @return      Renvoie le succès de l'opération
     */
    public boolean DecalerColonne(int ColNb, boolean Haut){
        if (ColNb<0 ||ColNb>6){
            return false;
        }
        Case temp;
        int direction;
        if (Haut){
            temp=Grid[0][ColNb-1];
            direction=1;
        }
        else{
            temp=Grid[6][ColNb-1];
            direction=-1;
        }
        for(int i=0;i<7;i++){
            int j;
            if(Haut){
                j=6-i;
            }
            else{
                j=i;
            }
            if(i==6){
                Grid[j][ColNb-1]=prochainecase;
                Grid[j][ColNb-1].Players=new ArrayList<>(temp.Players);
                temp.Players.clear();
            }
            else{
                Grid[j][ColNb-1]=Grid[j-direction][ColNb-1];
            }
        }
        return true;
    }
}
