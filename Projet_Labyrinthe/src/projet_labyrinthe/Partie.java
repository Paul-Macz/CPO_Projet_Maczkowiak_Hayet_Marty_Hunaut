/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lukha
 */
public class Partie {

    int nombreJoueurs;
    int joueurCourant = 0;
    Player[] listeJoueurs;
    Grille Labyrinth;
    static ArrayList<Case> ListeCases;
    static ArrayList<Case> CasesDispo;
    public static Random rand = new Random();

    /**
     * Initialise les attributs de la nouvelle partie
     */
    public Partie(int nbjoueurs) {
        nombreJoueurs = nbjoueurs;
        Labyrinth = new Grille();
        listeJoueurs = new Player[nbjoueurs];
        ListeCases = new ArrayList<>();
        CasesDispo = new ArrayList<>();
    }

    /**
     * Crée un joueur de la liste à partir de son numéro et de son nom.
     *
     * @param indice la position du joueur
     * @param nom le nom du joueur
     * @return Succès de l'opération
     */
    public boolean creerJoueur(int indice, String nom) {
        if (indice >= nombreJoueurs) {
            return false;
        }
        if (listeJoueurs[indice] != null) {
            return false;
        }
        listeJoueurs[indice] = new Player(nom, 24 / nombreJoueurs);
        return true;
    }

    /**
     * Initialise la partie dans un contexte graphique
     */
    public void InitialiserPartie() {
        setCasesDispo();
        attribuerCouleurs();
        distribuerCartes();
        PlaceCases();
        placerPionsDebut();
    }

    /**
     * Ajoute les pions des joueurs sur leur position de départ aux 4 coins du
     * plateau
     */
    public void placerPionsDebut() {
        for (int i = 0; i < listeJoueurs.length; i++) {
            switch (i) {
                case 0 -> Labyrinth.Grid[0][0].Players.add(listeJoueurs[0].marqueur);
                case 1 -> Labyrinth.Grid[0][6].Players.add(listeJoueurs[1].marqueur);
                case 2 -> Labyrinth.Grid[6][6].Players.add(listeJoueurs[2].marqueur);
                case 3 -> Labyrinth.Grid[6][0].Players.add(listeJoueurs[3].marqueur);
            }
        }
    }

    /**
     * Incrémente l'indice correspondant au joueur courant, ce faisant passant
     * au joueur suivant.
     */
    public void joueurSuivant() {
        joueurCourant = ++joueurCourant % nombreJoueurs;
    }

    /**
     * Attribue des couleurs aux joueurs, de façon non aléatoire.
     *
     * @return Succès de l'opération
     */
    public boolean attribuerCouleurs() {
        if (nombreJoueurs > 4 || nombreJoueurs < 1) {
            return false;
        }
        switch (nombreJoueurs) {
            case 4:
                listeJoueurs[3].attribuerCouleur("jaune");
            case 3:
                listeJoueurs[2].attribuerCouleur("rouge");
            case 2:
                listeJoueurs[1].attribuerCouleur("vert");
            case 1:
                listeJoueurs[0].attribuerCouleur("bleu");
        }
        return true;
    }

    /**
     * Crée la liste des cartes, les mélange et les distribue.
     *
     * @return Succès de l'opération
     */
    public boolean distribuerCartes() {
        /* Création de la liste des tuiles */
        Path cheminFichierListe = Path.of("src/projet_labyrinthe/properties.txt");
        List<String> ListeObjets;
        if (Files.notExists(cheminFichierListe)) {
            System.err.println("Le fichier properties.txt n'existe pas");
            return false;
        }
        if (!Files.isReadable(cheminFichierListe)) {
            System.err.println("Impossible de lire le fichier properties.txt");
            return false;
        }
        try {
            ListeObjets = Files.readAllLines​(cheminFichierListe);
        } catch (IOException ex) {
            return false;
        }
        //System.out.println(ListeObjets);
        // On supprime de la liste listeTypes ce qui n'est pas un objet 
        Iterator iter = ListeObjets.iterator();
        while (iter.hasNext()) {
            String[] elem = ((String) iter.next()).split(" ");
            String subelem = elem[0];
            
            if (subelem.equals("tuile1") 
                    || subelem.equals("tuile2") 
                    || subelem.equals("departB") 
                    || subelem.equals("departV") 
                    || subelem.equals("departJ") 
                    || subelem.equals("departR")
                    || subelem.equals("placeHolder")) {
                iter.remove();
            }
            
        }
        //System.out.println("1"+ListeObjets);
        
        if (ListeObjets.size() != 24) {
            return false;
        }

        /* On mélange la liste avec la méthode de Collections */
        Collections.shuffle(ListeObjets);

        /* Distribution des cartes */
        int j = 0;
        int nbCartesPJ = 24 / nombreJoueurs;
        for (int i = 0; i < ListeObjets.size(); i++) {
            if (i % nbCartesPJ == 0 && i != 0) {
                j++;
            }
            listeJoueurs[j].listeCartes[i % nbCartesPJ] = new Cartes(ListeObjets.get(i).split(" ")[0]);
            //System.out.println(listeJoueurs[j]+" "+listeJoueurs[j].listeCartes[i % nbCartesPJ]);
        }

        return true;
    }

    public static void setCasesDispo() {
        GetCard(CasesDispo);
        for (int i=0;i<CasesDispo.size();i++){
            if ("departB".equals(CasesDispo.get(i).object)
                    || "departV".equals(CasesDispo.get(i).object)
                    || "departJ".equals(CasesDispo.get(i).object)
                    || "departR".equals(CasesDispo.get(i).object)
                    || "tuile1".equals(CasesDispo.get(i).object)
                    || "tuile2".equals(CasesDispo.get(i).object)
                    || "placeHolder".equals(CasesDispo.get(i).object)){
                CasesDispo.remove(i);
            }
        }
    }
    
    public static boolean GetCard(ArrayList<Case> Liste){
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
            Liste.add(new Case(caseProp[0]));
            Liste.get(i).Haut = Boolean.parseBoolean(caseProp[1]);
            Liste.get(i).Bas = Boolean.parseBoolean(caseProp[2]);
            Liste.get(i).Gauche = Boolean.parseBoolean(caseProp[3]);
            Liste.get(i).Droite = Boolean.parseBoolean(caseProp[4]);
        }
        return true;
    }
    
    /**
     * Place dans chaque case de la grille une case souhaitée Fait appele à
     * PlaceCase() et PlaceCaseSansObjet()
     *
     * @return renvoie le succès de la méthode
     */
    public boolean PlaceCases() {
        GetCard(ListeCases);

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

                            Labyrinth.PlaceCase(i, j, new Case(ListeCases.get(index).object));
                            ListeCases.remove(index);
                        } //Si toutes les autres cases ont été placée
                        else {
                            PlaceCaseSansObjet(i, j);
                        }
                    }
                }
            }
        }
        Labyrinth.Melanger();
        return true;
    }

    /**
     * Place une tuile sans objet aléatoire dans la grille
     *
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
                    Labyrinth.PlaceCase(i, j, new Case("tuile1"));
                    break;
                }
            }
        } else {
            //Case en L
            for (int k = 0; k < ListeCases.size(); k++) {
                if ("tuile2".equals(ListeCases.get(k).object)) {
                    index = k;
                    Labyrinth.PlaceCase(i, j, new Case("tuile2"));
                    break;
                }
            }
        }
    }
}
