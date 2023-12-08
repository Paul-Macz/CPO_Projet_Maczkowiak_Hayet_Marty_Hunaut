/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author lukha
 */
public class Partie {
    Grille Labyrinth;
    Case[] ListeCases;
    
    /**
     *  Initialise les attributs de la nouvelle partie
     */
    public Partie(){
        Labyrinth = new Grille();
        PlaceCases();
        ListeCases = new Case[31];
    }
    
    /**
     * Place dans chaque case de la grille une case souhaitée
     * Fait appele à PlaceCase()
     */
    public boolean PlaceCases(){
        Path properties = Path.of("src/projet_labyrinthe/properties.txt");
        java.util.List<String> liste;
        if (Files.notExists(properties)){
            return false;
        }
        if (!Files.isReadable(properties)){
            return false;
        }
        try{
            liste = Files.readAllLines(properties);
        } 
        catch(IOException ex){
            return false;
        }
        for (int i=0;i<liste.size();i++){
            String [] caseProp = liste.get(i).split(" ");
            ListeCases[i] = new Case(caseProp[0]);
            
        }
                
        /*Case CaseChoisie = new Case(); //Temporaire le temps de premiers tests
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                Labyrinth.PlaceCase(i, j, CaseChoisie);
            }
        }*/
        return true;
    }
}
