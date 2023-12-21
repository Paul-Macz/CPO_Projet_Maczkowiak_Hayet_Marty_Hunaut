/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lukha
 */
public class Grille {

    Case[][] Grid;
    Case prochainecase;
    public static Random rand = new Random();

    /**
     * Créer une nouvelle grille de cases en 7x7
     */
    public Grille() {
        Grid = new Case[7][7];
    }

    /**
     * Place sur la grille une case souhaitée
     *
     * @param x Détermine sa position horizontale
     * @param y Détermine sa postion verticale
     * @param CaseChoisie Détermine la case souhaitée
     */
    public void PlaceCase(int x, int y, Case CaseChoisie) {
        if (Grid[x][y] == null) {
            Grid[x][y] = CaseChoisie;
        }
    }

    /**
     * Déplace l'ensemble des cases de la ligne dans une direction
     *
     * @param LigneNb Determine la ligne modifiée
     * @param Droite Determine si on se déplace vers la droite ou vers la gauche
     * @return Renvoie le succès de l'opération
     */
    public boolean DecalerLigne(int LigneNb, boolean Droite) {
        if (LigneNb < 0 || LigneNb > 6) {
            return false;
        }
        Case temp;
        int direction;
        if (Droite) {
            temp = Grid[LigneNb - 1][6];
            direction = 1;
        } else {
            temp = Grid[LigneNb - 1][0];
            direction = -1;
        }
        for (int i = 0; i < 7; i++) {
            int j;
            if (Droite) {
                j = 6 - i;
            } else {
                j = i;
            }
            if (i == 6) {
                Grid[LigneNb - 1][j] = prochainecase;
                Grid[LigneNb - 1][j].Players = new ArrayList<>(temp.Players);
                temp.Players.clear();
                if (temp.presenceObjet()) {
                    Partie.ListeCases.add(temp);
                }
            } else {

                Grid[LigneNb - 1][j] = Grid[LigneNb - 1][j - direction];
            }
        }
        return true;
    }

    /**
     * Déplace l'ensemble des cases de la colonne dans une direction
     *
     * @param ColNb Determine la colonne modifiée
     * @param Haut Determine si le déplacement provient du haut
     * @return Renvoie le succès de l'opération
     */
    public boolean DecalerColonne(int ColNb, boolean Haut) {
        if (ColNb < 0 || ColNb > 6) {
            return false;
        }
        Case temp;
        int direction;
        if (Haut) {
            temp = Grid[6][ColNb - 1];
            direction = 1;
        } else {
            temp = Grid[0][ColNb - 1];
            direction = -1;
        }
        for (int i = 0; i < 7; i++) {
            int j;
            if (Haut) {
                j = 6 - i;
            } else {
                j = i;
            }
            if (i == 6) {

                Grid[j][ColNb - 1] = prochainecase;
                Grid[j][ColNb - 1].Players = new ArrayList<>(temp.Players);
                temp.Players.clear();
                if (temp.presenceObjet()) {
                    Partie.ListeCases.add(temp);
                }
            } else {
                Grid[j][ColNb - 1] = Grid[j - direction][ColNb - 1];
            }
        }
        return true;
    }

    /**
     * Mélange la grille sauf les cases de départ
     *
     * @return Si l'opération est un succès
     */
    public boolean Melanger() {
        int x1, x2, y1, y2;

        for (int i = 0; i < 30; i++) {
            do {
                x1 = rand.nextInt(7);
                y1 = rand.nextInt(7);
            } while (CaseDepart(x1, y1));

            do {
                x2 = rand.nextInt(7);
                y2 = rand.nextInt(7);
            } while (CaseDepart(x2, y2));

            if (!EchangerCases(x1, y1, x2, y2)) {
                return false;
            }
        }
        Tournergrid();
        return true;

    }

    /**
     * Tourne les case de la grille (sauf les cases de départ) dans une
     * orientation aléatoire
     */
    public void Tournergrid() {
        int angle;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (!CaseDepart(i, j)) {
                    angle = rand.nextInt(4) * 90;
                    Tourner(i, j, angle);
                }
            }
        }
    }

    /**
     * Tourne une case
     *
     * @param x Abscisse de la case
     * @param y Ordonnee de la case
     * @param angle Angle de la rotation
     */
    public void Tourner(int x, int y, int angle) {
        Grid[x][y].TurnCase(angle);
    }

    /**
     * Echange les cases de deux emplacements dans la grille
     *
     * @param x1 Coordonnée en abscisse dans la première case
     * @param y1 Coordonnée en ordonnée dans la première case
     * @param x2 Coordonnée en abscisse dans la deuxième case
     * @param y2 Coordonnée en ordonnée dans la deuxième case
     * @return Succès de l'opération
     */
    public boolean EchangerCases(int x1, int y1, int x2, int y2) {
        if (x1 > 6 || x1 < 0) {
            return false;
        }
        if (y1 > 6 || y1 < 0) {
            return false;
        }
        if (x2 > 6 || x2 < 0) {
            return false;
        }
        if (y2 > 6 || y2 < 0) {
            return false;
        }
        Case temp = Grid[x1][y1];
        Grid[x1][y1] = Grid[x2][y2];
        Grid[x2][y2] = temp;
        return true;
    }

    /**
     * Vérifie si une case donnée est une case de départ
     *
     * @param x Coordonnée en abscisse
     * @param y Coordonnée en ordonnée
     * @return Vrai si la case est une case de départ
     */
    public boolean CaseDepart(int x, int y) {
        if (x > 6 || x < 0) {
            return false;
        }
        if (y > 6 || y < 0) {
            return false;
        }
        return ((x == 0 && y == 0)
                || (x == 0 && y == 6)
                || (x == 6 && y == 0)
                || (x == 6 && y == 6));
    }

    /**
     * Détermine si un passage existe entre deux cases adjacentes
     *
     * @param x1 Abscisse de la première case
     * @param y1 Ordonnée de la première case
     * @param x2 Abscisse de la deuxième case
     * @param y2 Ordonnée de la deuxième case
     * @return Vrai si présence d'un passage
     */
    public boolean PassagedeCases(int x1, int y1, int x2, int y2) {
        /* Si les coordonnées sont valides */
        if (x1 > 6 || x1 < 0 || y1 > 6 || y1 < 0
                || x2 > 6 || x2 < 0 || y2 > 6 || y2 < 0) {
            return false;
        }

        /* Si les tuiles sont sur la même colonne ou ligne */
        if (x1 == x2) {
            //System.out.println("1: "+"H:"+Grid[x1][y1].Haut+" B:"+Grid[x1][y1].Bas+" G:"+Grid[x1][y1].Gauche+" D:"+Grid[x1][y1].Droite);
            //System.out.println("2: "+"H:"+Grid[x2][y2].Haut+" B:"+Grid[x2][y2].Bas+" G:"+Grid[x2][y2].Gauche+" D:"+Grid[x2][y2].Droite);

            if (Math.abs(y1 - y2) > 1) {
                return false;
            } else if (y1 - y2 >= 0) {
                return (Grid[x1][y1].Gauche
                        && Grid[x2][y2].Droite);
            } else {
                return (Grid[x1][y1].Droite
                        && Grid[x2][y2].Gauche);
            }
        } else if (y1 == y2) {
            //System.out.println("1: "+"H:"+Grid[x1][y1].Haut+" B:"+Grid[x1][y1].Bas+" G:"+Grid[x1][y1].Gauche+" D:"+Grid[x1][y1].Droite);
            //System.out.println("2: "+"H:"+Grid[x2][y2].Haut+" B:"+Grid[x2][y2].Bas+" G:"+Grid[x2][y2].Gauche+" D:"+Grid[x2][y2].Droite);
            /* On vérifie si les tuiles sont adjacentes */
            if (Math.abs(x1 - x2) > 1) {
                return false;
            } else if (x1 - x2 >= 0) {
                return (Grid[x1][y1].Haut
                        && Grid[x2][y2].Bas);
            } else {
                return (Grid[x1][y1].Bas
                        && Grid[x2][y2].Haut);
            }
        } else {
            return false;
        }
    }

    /**
     * Détermine si il existe un chemin entre deux cases.
     *
     * @param x1 Abscisse de la première case
     * @param y1 Ordonnée de la première case
     * @param x2 Abscisse de la deuxième case
     * @param y2 Ordonnée de la deuxième ase
     * @param CasesConnues Tableau des cases connues (null pour un appel manuel)
     * @return Vrai si présence d'un chemin
     */
    public boolean PathFinding(int x1, int y1, int x2, int y2, ArrayList<Case> CasesConnues) {
        ArrayList<Case> CasesCouloir;
        if (CasesConnues == null) {
            CasesCouloir = new ArrayList<>();
            CasesCouloir.add(Grid[x1][y1]);
        } else {
            CasesCouloir = CasesConnues;
        }
        ArrayList<ArrayList<Integer>> tuilesPart = CasesAccessibles(x1, y1);
        //System.out.print(tuilesPart);
        ArrayList<Integer> listeVerif = new ArrayList<>();
        listeVerif.add(x2);
        listeVerif.add(y2);
        if (tuilesPart.contains(listeVerif)) {
            return true;
        } else if (!tuilesPart.isEmpty()) {
            for (ArrayList<Integer> coordsCasesListees : tuilesPart) {
                //System.out.println(coordsCasesListees);
                if (!CasesCouloir.contains(Grid[coordsCasesListees.get(0)][coordsCasesListees.get(1)])) {
                    CasesCouloir.add(Grid[coordsCasesListees.get(0)][coordsCasesListees.get(1)]);
                    if (PathFinding(coordsCasesListees.get(0), coordsCasesListees.get(1), x2, y2, CasesCouloir)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Cherche le pion du joueur dans la grille et retourne sa position
     *
     * @param JoueurRecherche Le propriétaire du pion
     * @return Les coordonnées du pion
     */
    public int[] positionPion(Player JoueurRecherche) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (Grid[i][j].presenceJoueurs()) {
                    if (Grid[i][j].Players.contains(JoueurRecherche.marqueur)) {
                        return (new int[]{i, j});
                    }
                }
            }
        }
        return null;
    }

    /**
     * Donne la liste des cases accessibles depuis une case donnée
     *
     * @param x Abscisse de la case
     * @param y Ordonnée de la case
     * @return Liste des coordonnées des cases accessibles
     */
    public ArrayList<ArrayList<Integer>> CasesAccessibles(int x, int y) {
        ArrayList<ArrayList<Integer>> CasesAccessibles = new ArrayList<>();
        if (PassagedeCases(x, y, x + 1, y)) {
            ArrayList<Integer> listeInter = new ArrayList<>();
            listeInter.add(x + 1);
            listeInter.add(y);
            CasesAccessibles.add(listeInter);
        }
        if (PassagedeCases(x, y, x - 1, y)) {
            ArrayList<Integer> listeInter = new ArrayList<>();
            listeInter.add(x - 1);
            listeInter.add(y);
            CasesAccessibles.add(listeInter);
        }
        if (PassagedeCases(x, y, x, y + 1)) {
            ArrayList<Integer> listeInter = new ArrayList<>();
            listeInter.add(x);
            listeInter.add(y + 1);
            CasesAccessibles.add(listeInter);
        }
        if (PassagedeCases(x, y, x, y - 1)) {
            ArrayList<Integer> listeInter = new ArrayList<>();
            listeInter.add(x);
            listeInter.add(y - 1);
            CasesAccessibles.add(listeInter);
        }
        return CasesAccessibles;
    }
}
