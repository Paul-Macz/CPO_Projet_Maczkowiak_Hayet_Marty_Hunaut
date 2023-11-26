/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

/**
 *
 * @author lukha
 */
public class Partie {
    Grille Labyrinth;
    
    /**
     *  Initialise les attributs de la nouvelle partie
     */
    public Partie(){
        Labyrinth = new Grille();
        PlaceCases();
    }
    
    /**
     * Place dans chaque case de la grille une case souhaitée
     * Fait appele à PlaceCase()
     */
    public void PlaceCases(){
        Case CaseChoisie = new Case(); //Temporaire le temps de premiers tests
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                Labyrinth.PlaceCase(i, j, CaseChoisie);
            }
        }
    }
}
