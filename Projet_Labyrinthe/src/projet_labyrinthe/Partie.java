/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lukha
 */
public class Partie {

    Grille Labyrinth;
    ArrayList<Case> ListeCases;
    public static Random rand = new Random();

    /**
     * Initialise les attributs de la nouvelle partie
     */
    public Partie() {
        Labyrinth = new Grille();
        ListeCases = new ArrayList<>();
        PlaceCases();

    }

    /**
     * Place dans chaque case de la grille une case souhaitée 
     * Fait appele à PlaceCase() et PlaceCaseSansObjet()
     * @return renvoie le succès de la méthode
     */
    public boolean PlaceCases() {
        //Récupération des propriétés de chaque case possible
        Path properties = Path.of("src/projet_labyrinthe/properties.txt");
        java.util.List<String> liste;
        try {
            liste = Files.readAllLines(properties);
        } catch (IOException ex) {
            return false;
        }

        //Décomposition et stockage des propriétés
        for (int i = 0; i < liste.size(); i++) {
            String[] caseProp = liste.get(i).split(" ");
            ListeCases.add(new Case(caseProp[0]));
            ListeCases.get(i).Haut = Boolean.parseBoolean(caseProp[1]);
            ListeCases.get(i).Bas = Boolean.parseBoolean(caseProp[2]);
            ListeCases.get(i).Gauche = Boolean.parseBoolean(caseProp[3]);
            ListeCases.get(i).Droite = Boolean.parseBoolean(caseProp[4]);
        }

        //Placement des cases
        int index = -1;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j == 0) {
                    //Case départ Bleue
                    for (int k = 0; k < ListeCases.size(); k++) {
                        if ("departB".equals(ListeCases.get(k).object)) {
                            index = k;
                            break;
                        }
                    }
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    ListeCases.remove(index);
                } else if (i == 0 && j == 6) {
                    //Case départ Verte
                    for (int k = 0; k < ListeCases.size(); k++) {
                        if ("departV".equals(ListeCases.get(k).object)) {
                            index = k;
                            break;
                        }
                    }
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    ListeCases.remove(index);
                } else if (i == 6 && j == 0) {
                    //Case départ Jaune
                    for (int k = 0; k < ListeCases.size(); k++) {
                        if ("departJ".equals(ListeCases.get(k).object)) {
                            index = k;
                            break;
                        }
                    }
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    ListeCases.remove(index);
                } else if (i == 6 && j == 6) {
                    //Case départ Rouge
                    for (int k = 0; k < ListeCases.size(); k++) {
                        if ("departR".equals(ListeCases.get(k).object)) {
                            index = k;
                            break;
                        }
                    }
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    ListeCases.remove(index);
                } else {
                    //Tous les autres emplacement de la grille
                    if (rand.nextInt(100) < 50) {
                        //Probabilité de 40% d'une case sans objet
                        PlaceCaseSansObjet(i, j);
                    } else {
                        //Autres cases
                        if (ListeCases.size() > 5) {
                            //Vérification de ne pas réutiliser les cases suivantes
                            do {
                                index = rand.nextInt(ListeCases.size());
                            } while ("tuile1".equals(ListeCases.get(index).object)
                                    || "tuile2".equals(ListeCases.get(index).object)
                                    || "departV".equals(ListeCases.get(index).object)
                                    || "departR".equals(ListeCases.get(index).object)
                                    || "departJ".equals(ListeCases.get(index).object)
                                    || "departB".equals(ListeCases.get(index).object)
                                    || "placeHolder".equals(ListeCases.get(index).object));

                            Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                            ListeCases.remove(index);
                        } //Si toutes les autres cases ont été placée
                        else {
                            PlaceCaseSansObjet(i, j);
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Place une tuile sans objet aléatoire dans la grille
     * @param i Coordonnée en abscisse
     * @param j Coordonnée en ordonnée
     */
    public void PlaceCaseSansObjet(int i, int j) {
        int index;
        if (rand.nextInt(3) > 0) {
            //Ligne droite
            for (int k = 0; k < ListeCases.size(); k++) {
                if ("tuile1".equals(ListeCases.get(k).object)) {
                    index = k;
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    break;
                }
            }
        } else {
            //Case en L
            for (int k = 0; k < ListeCases.size(); k++) {
                if ("tuile2".equals(ListeCases.get(k).object)) {
                    index = k;
                    Labyrinth.PlaceCase(i, j, ListeCases.get(index));
                    break;
                }
            }
        }
    }
}
