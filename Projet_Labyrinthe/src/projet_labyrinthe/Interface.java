/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_labyrinthe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author lukha
 */
public class Interface extends javax.swing.JFrame {

    static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static Dimension ScreenDim = toolkit.getScreenSize();
    static int CaseSize = ScreenDim.height / 10;
    static int CardSize = ScreenDim.height / 7;

    String action = "";
    Partie Session;
    Case caseselectionnee;
    CaseGraphique casegraphselectionnee;
    CaseGraphique boutonselectionne;

    CaseGraphique Top1 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Top2 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Top3 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Bottom1 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Bottom2 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Bottom3 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Left1 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Left2 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Left3 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Right1 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Right2 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique Right3 = new CaseGraphique(new Case("placeHolder"));
    CaseGraphique[] Actions = new CaseGraphique[12];

    boolean deplacement = false, placement = false;

    /**
     * Creates new form FenetreDeJeu
     */
    public Interface() {
        initComponents();
        Session = new Partie(4);
        Session.creerJoueur(0, "Scar");
        Session.creerJoueur(1, "Tim");
        Session.creerJoueur(2, "Grian");
        Session.creerJoueur(3, "Pearl");
        Session.InitialiserPartie();

        //DebugMode();
        Initialisation();
    }

    private void Initialisation() {
        Actions[0] = Top1;
        Actions[1] = Top2;
        Actions[2] = Top3;
        Actions[3] = Bottom1;
        Actions[4] = Bottom2;
        Actions[5] = Bottom3;
        Actions[6] = Left1;
        Actions[7] = Left2;
        Actions[8] = Left3;
        Actions[9] = Right1;
        Actions[10] = Right2;
        Actions[11] = Right3;

        PlaceComponents();
        placement = true;
    }

    private void DebugMode() {
        for (Component component : getContentPane().getComponents()) {
            component.setVisible(false);
        }
        setSize(ScreenDim.width, ScreenDim.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel buttonPanel = new JPanel();

        JButton but = new JButton("Place une case");
        CaseSize = (ScreenDim.height) / 6;
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaseGraphique democase = new CaseGraphique(new Case("tuile1"));
                democase.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        casegraphselectionnee = (CaseGraphique) e.getSource();

                    }
                });
                getContentPane().add(democase);
                democase.setBounds(ScreenDim.width / 2, (ScreenDim.height) / 2, (ScreenDim.height) / 6, (ScreenDim.height) / 6);
                CaseSize = (ScreenDim.height) / 6;
                add(Rotate);
                Rotate.setBounds((ScreenDim.width) * 2 / 10, (ScreenDim.height) / 20, (ScreenDim.width) / 10, (ScreenDim.height) / 10);
                Rotate.setVisible(true);
            }
        });
        add(but);
        but.setBounds((ScreenDim.width) / 10, (ScreenDim.height) / 20, (ScreenDim.width) / 10, (ScreenDim.height) / 10);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Labyrinth = new javax.swing.JPanel();
        Pane_Info = new javax.swing.JPanel();
        ChronoJeu = new javax.swing.JLabel();
        lbl_NomJoueur = new javax.swing.JLabel();
        lbl_JoueurCourant = new javax.swing.JLabel();
        lbl_ChronoTour = new javax.swing.JLabel();
        lbl_ChronoJeu = new javax.swing.JLabel();
        lbl_nextCase = new javax.swing.JLabel();
        lbl_nextCard = new javax.swing.JLabel();
        lbl_nomJ1 = new javax.swing.JLabel();
        lbl_J1 = new javax.swing.JLabel();
        lbl_nomJ2 = new javax.swing.JLabel();
        lbl_J2 = new javax.swing.JLabel();
        lbl_J3 = new javax.swing.JLabel();
        lbl_nomJ3 = new javax.swing.JLabel();
        lbl_nomJ4 = new javax.swing.JLabel();
        lbl_J4 = new javax.swing.JLabel();
        Pane_J1 = new javax.swing.JPanel();
        Chrono_J1 = new javax.swing.JLabel();
        lbl_Objet_J1 = new javax.swing.JLabel();
        lbl_txtChronoJ1 = new javax.swing.JLabel();
        lbl_txtObjetJ1 = new javax.swing.JLabel();
        Pane_J2 = new javax.swing.JPanel();
        Chrono_J2 = new javax.swing.JLabel();
        lbl_Objet_J2 = new javax.swing.JLabel();
        lbl_txtChronoJ2 = new javax.swing.JLabel();
        lbl_txtObjetJ2 = new javax.swing.JLabel();
        Pane_J3 = new javax.swing.JPanel();
        Chrono_J3 = new javax.swing.JLabel();
        lbl_Objet_J3 = new javax.swing.JLabel();
        lbl_txtChronoJ3 = new javax.swing.JLabel();
        lbl_txtObjetJ3 = new javax.swing.JLabel();
        Pane_J4 = new javax.swing.JPanel();
        Chrono_J4 = new javax.swing.JLabel();
        lbl_Objet_J4 = new javax.swing.JLabel();
        lbl_txtChronoJ4 = new javax.swing.JLabel();
        lbl_txtObjetJ4 = new javax.swing.JLabel();
        Validate = new javax.swing.JButton();
        Rotate = new javax.swing.JButton();
        btn_Help = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Labyrinth.setBackground(new java.awt.Color(102, 102, 102));
        Labyrinth.setLayout(new java.awt.GridLayout(7, 7));
        getContentPane().add(Labyrinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, 190));
        Labyrinth.getAccessibleContext().setAccessibleName("");
        Labyrinth.getAccessibleContext().setAccessibleDescription("");

        Pane_Info.setBackground(new java.awt.Color(0, 102, 51));
        Pane_Info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pane_Info.add(ChronoJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_NomJoueur.setText("jLabel1");
        Pane_Info.add(lbl_NomJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_JoueurCourant.setText("Joueur Courant");
        Pane_Info.add(lbl_JoueurCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_ChronoTour.setText("Chrono du Tour");
        Pane_Info.add(lbl_ChronoTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_ChronoJeu.setText("Chrono de la Partie");
        Pane_Info.add(lbl_ChronoJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_nextCase.setText("Prochaine Case");
        Pane_Info.add(lbl_nextCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_nextCard.setText("Objet à Ramasser");
        Pane_Info.add(lbl_nextCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_nomJ1.setText("name");
        Pane_Info.add(lbl_nomJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_J1.setText("Joueur 1");
        Pane_Info.add(lbl_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        lbl_nomJ2.setText("name");
        Pane_Info.add(lbl_nomJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_J2.setText("Joueur 2");
        Pane_Info.add(lbl_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl_J3.setText("Joueur 3");
        Pane_Info.add(lbl_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl_nomJ3.setText("name");
        Pane_Info.add(lbl_nomJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_nomJ4.setText("name");
        Pane_Info.add(lbl_nomJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        lbl_J4.setText("Joueur 4");
        Pane_Info.add(lbl_J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        Pane_J1.setBackground(new java.awt.Color(0, 102, 153));
        Pane_J1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chrono_J1.setText("jLabel1");
        Pane_J1.add(Chrono_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lbl_Objet_J1.setText("jLabel1");
        Pane_J1.add(lbl_Objet_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lbl_txtChronoJ1.setText("Temps");
        Pane_J1.add(lbl_txtChronoJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_txtObjetJ1.setText("Nb d'objets ramassés");
        Pane_J1.add(lbl_txtObjetJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Pane_Info.add(Pane_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 60));

        Pane_J2.setBackground(new java.awt.Color(0, 153, 51));
        Pane_J2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chrono_J2.setText("jLabel1");
        Pane_J2.add(Chrono_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lbl_Objet_J2.setText("jLabel1");
        Pane_J2.add(lbl_Objet_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lbl_txtChronoJ2.setText("Temps");
        Pane_J2.add(lbl_txtChronoJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lbl_txtObjetJ2.setText("Nb d'objets ramassés");
        Pane_J2.add(lbl_txtObjetJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Pane_Info.add(Pane_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 60));

        Pane_J3.setBackground(new java.awt.Color(204, 204, 0));
        Pane_J3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chrono_J3.setText("jLabel1");
        Pane_J3.add(Chrono_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lbl_Objet_J3.setText("jLabel1");
        Pane_J3.add(lbl_Objet_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lbl_txtChronoJ3.setText("Temps");
        Pane_J3.add(lbl_txtChronoJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lbl_txtObjetJ3.setText("Nb d'objets ramassés");
        Pane_J3.add(lbl_txtObjetJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Pane_Info.add(Pane_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 60));

        Pane_J4.setBackground(new java.awt.Color(153, 0, 0));
        Pane_J4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chrono_J4.setText("jLabel1");
        Pane_J4.add(Chrono_J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lbl_Objet_J4.setText("jLabel1");
        Pane_J4.add(lbl_Objet_J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lbl_txtChronoJ4.setText("Temps");
        Pane_J4.add(lbl_txtChronoJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lbl_txtObjetJ4.setText("Nb d'objets ramassés");
        Pane_J4.add(lbl_txtObjetJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Pane_Info.add(Pane_J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 60));

        getContentPane().add(Pane_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Validate.setBackground(new java.awt.Color(0, 153, 0));
        Validate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Validate.setText("✔");
        Validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateActionPerformed(evt);
            }
        });
        getContentPane().add(Validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 432, -1, -1));

        Rotate.setBackground(new java.awt.Color(255, 153, 0));
        Rotate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Rotate.setForeground(new java.awt.Color(255, 255, 255));
        Rotate.setText("⤾");
        Rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateActionPerformed(evt);
            }
        });
        getContentPane().add(Rotate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        btn_Help.setBackground(new java.awt.Color(153, 153, 153));
        btn_Help.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btn_Help.setForeground(new java.awt.Color(255, 255, 255));
        btn_Help.setText("?");
        btn_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HelpActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceComponents() {
        //Creation de la grille
        setSize(ScreenDim.width, ScreenDim.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        //Creation de la grille
        PlaceGrid();

        //Creation des boutons
        PlaceBtn();

        //Création du panneau d'information
        PlacePane_Info();
    }
    
    /**
     * Place les elements de la grille
     */
    public void PlaceGrid(){
        Labyrinth.setBounds(ScreenDim.width / 2, (ScreenDim.height) / 10, (ScreenDim.height) * 7 / 10, (ScreenDim.height) * 7 / 10);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                CaseGraphique Case = CaseGraphique.createInstance(Session.Labyrinth.Grid[i][j], i, j);
                Case.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        casegraphselectionnee = (CaseGraphique) e.getSource();
                        caseselectionnee = casegraphselectionnee.CaseGrapheAssocie;
                        if (deplacement) {
                            int[] posPionJCourant = Session.Labyrinth.positionPion(Session.listeJoueurs[Session.joueurCourant]);
                            if (posPionJCourant != null) {
                                if (Session.Labyrinth.PathFinding(posPionJCourant[0], posPionJCourant[1], Case.posX, Case.posY, null)) {
                                    Peon pionActuel = Session.listeJoueurs[Session.joueurCourant].marqueur;
                                    Session.Labyrinth.Grid[posPionJCourant[0]][posPionJCourant[1]].Players.remove(pionActuel);
                                    Session.Labyrinth.Grid[Case.posX][Case.posY].Players.add(pionActuel);
                                    pionActuel.associe.nouvellePosition(Case.CaseGrapheAssocie);
                                    /* Si le joueur a fini, on termine la partie */
                                    if (pionActuel.associe.tousObjetsRamasses()) {
                                        //partieTerminee(pionActuel.associe);
                                    }
                                    deplacement = false;
                                }
                                //actualiserAffichage();
                            }
                        }
                    }
                });
                Case.setPreferredSize(new Dimension(ScreenDim.height / 10, ScreenDim.height / 10));
                Labyrinth.add(Case);
            }
        }
    }
    
    /**
     * Place les boutons
     */
    public void PlaceBtn() {
        //Creation des boutons d'actions de la grille
        Top1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top1ActionPerformed(evt);
            }
        });
        getContentPane().add(Top1);
        Top1.setBounds((ScreenDim.width) / 2 + ScreenDim.height / 10, 0, ScreenDim.height / 10, ScreenDim.height / 10);

        Top2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top2ActionPerformed(evt);
            }
        });
        getContentPane().add(Top2);
        Top2.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 3 / 10, 0, ScreenDim.height / 10, ScreenDim.height / 10);

        Top3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top3ActionPerformed(evt);
            }
        });
        getContentPane().add(Top3);
        Top3.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 5 / 10, 0, ScreenDim.height / 10, ScreenDim.height / 10);

        Bottom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bottom1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bottom1);
        Bottom1.setBounds((ScreenDim.width) / 2 + ScreenDim.height / 10, (ScreenDim.height) * 8 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Bottom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bottom2ActionPerformed(evt);
            }
        });
        getContentPane().add(Bottom2);
        Bottom2.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 3 / 10, (ScreenDim.height) * 8 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Bottom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bottom3ActionPerformed(evt);
            }
        });
        getContentPane().add(Bottom3);
        Bottom3.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 5 / 10, (ScreenDim.height) * 8 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Left1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Left1ActionPerformed(evt);
            }
        });
        getContentPane().add(Left1);
        Left1.setBounds((ScreenDim.width) / 2 - (ScreenDim.height) / 10, (ScreenDim.height) * 2 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Left2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Left2ActionPerformed(evt);
            }
        });
        getContentPane().add(Left2);
        Left2.setBounds((ScreenDim.width) / 2 - (ScreenDim.height) / 10, (ScreenDim.height) * 4 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Left3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Left3ActionPerformed(evt);
            }
        });
        getContentPane().add(Left3);
        Left3.setBounds((ScreenDim.width) / 2 - (ScreenDim.height) / 10, (ScreenDim.height) * 6 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Right1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Right1ActionPerformed(evt);
            }
        });
        getContentPane().add(Right1);
        Right1.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 7 / 10, (ScreenDim.height) * 2 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Right2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Right2ActionPerformed(evt);
            }
        });
        getContentPane().add(Right2);
        Right2.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 7 / 10, (ScreenDim.height) * 4 / 10, ScreenDim.height / 10, ScreenDim.height / 10);

        Right3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Right3ActionPerformed(evt);
            }
        });
        getContentPane().add(Right3);
        Right3.setBounds((ScreenDim.width) / 2 + (ScreenDim.height) * 7 / 10, (ScreenDim.height) * 6 / 10, ScreenDim.height / 10, ScreenDim.height / 10);
        
        //Creation autres boutons d'actions
        Validate.setBounds((ScreenDim.width) * 7 / 20, (ScreenDim.height) * 7 / 9, (ScreenDim.height) * 3 / 40, (ScreenDim.height) * 3 / 40);
        Validate.setText("<html>&#10003;<html>");
        Validate.setFont(new Font("Arial Unicode MS",Font.BOLD,18));
        Validate.setForeground(Color.white);
        Rotate.setBounds((ScreenDim.width) * 8 / 20, (ScreenDim.height) * 7 / 9, (ScreenDim.height) * 3 / 40, (ScreenDim.height) * 3 / 40);
        Rotate.setText("<html>&#10558;<html>");
        Rotate.setFont(new Font("Arial Unicode MS",Font.BOLD,24));
        Rotate.setForeground(Color.white);
        btn_Help.setBounds((ScreenDim.width) * 7 / 20, (ScreenDim.height) / 30, (ScreenDim.height) * 3 / 40, (ScreenDim.height) * 3 / 40);

    }
    
    /**
     * Place le panneau information et ses elements
     */
    public void PlacePane_Info(){
        Pane_Info.setBounds(0, 0, (ScreenDim.width) / 3, ScreenDim.height);
        
        Pane_Info.add(lbl_ChronoJeu, new AbsoluteConstraints((ScreenDim.width)/8, (ScreenDim.height)/100 , lbl_ChronoJeu.getWidth(),lbl_ChronoJeu.getHeight()));
        Pane_Info.add(lbl_JoueurCourant, new AbsoluteConstraints((ScreenDim.width)*3/100, (ScreenDim.height)/12 , lbl_JoueurCourant.getWidth(),lbl_JoueurCourant.getHeight()));
        Pane_Info.add(lbl_NomJoueur, new AbsoluteConstraints((ScreenDim.width)/8, (ScreenDim.height)/12 , lbl_NomJoueur.getWidth(),lbl_NomJoueur.getHeight()));
        Pane_Info.add(lbl_ChronoTour, new AbsoluteConstraints((ScreenDim.width)/8, (ScreenDim.height)/6 , lbl_ChronoTour.getWidth(),lbl_ChronoTour.getHeight()));

        
        CarteGraphique ObjetaRamasser = new CarteGraphique(new Cartes("araignee"));
        Pane_Info.add(ObjetaRamasser, new AbsoluteConstraints((ScreenDim.width)*3/100, (ScreenDim.height)*9/40 , (ScreenDim.width)/8, (ScreenDim.height)/4));
        Pane_Info.add(lbl_nextCard, new AbsoluteConstraints( (ScreenDim.width)*3 / 100, (ScreenDim.height)* 11/24, lbl_nextCard.getWidth(),lbl_nextCard.getHeight()));
        
        Session.Labyrinth.prochainecase = new Case("cle");
        CaseGraphique ProchaineCase = new CaseGraphique(new Case(Session.Labyrinth.prochainecase.object));
        ProchaineCase.setScale(1.3);
        Pane_Info.add(ProchaineCase, new AbsoluteConstraints((ScreenDim.width)/6, (ScreenDim.height)/4, (ScreenDim.height)* 13/100, (ScreenDim.height)* 13/100));
        Pane_Info.add(lbl_nextCase, new AbsoluteConstraints((ScreenDim.width)/6, (ScreenDim.height)* 10/24, lbl_nextCase.getWidth(), lbl_nextCase.getHeight()));
        
        
        Pane_Info.add(lbl_J1, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*21/40));
        Pane_Info.add(lbl_nomJ1, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*22/40));
        Pane_Info.add(Pane_J1, new AbsoluteConstraints((ScreenDim.width)/9, (ScreenDim.height)/2, (Pane_Info.getWidth())*6/10, Pane_J1.getHeight()));
        //LayoutManager layout=Pane_Info.getLayout();
        //Pane_J1.add(lbl_txtChronoJ1, new AbsoluteConstraints((ScreenDim.width)*11/90,(ScreenDim.height)/2));
        
        Pane_Info.add(lbl_J2, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*25/40));
        Pane_Info.add(lbl_nomJ2, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*26/40));
        Pane_Info.add(Pane_J2, new AbsoluteConstraints((ScreenDim.width)/9, (ScreenDim.height)*12/20, (Pane_Info.getWidth())*6/10, Pane_J1.getHeight()));

        Pane_Info.add(lbl_J3, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*29/40));
        Pane_Info.add(lbl_nomJ3, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*30/40));
        Pane_Info.add(Pane_J3, new AbsoluteConstraints((ScreenDim.width)/9, (ScreenDim.height)*14/20, (Pane_Info.getWidth())*6/10, Pane_J1.getHeight()));
        
        Pane_Info.add(lbl_J4, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*33/40));
        Pane_Info.add(lbl_nomJ4, new AbsoluteConstraints((ScreenDim.width)*3/100,(ScreenDim.height)*34/40));
        Pane_Info.add(Pane_J4, new AbsoluteConstraints((ScreenDim.width)/9, (ScreenDim.height)*16/20, (Pane_Info.getWidth())*6/10, Pane_J1.getHeight()));

    }
    
    public void SwitchCase() {
        if (action != "") {
            for (int i = 0; i < Actions.length; i++) {
                if (Actions[i].CaseGrapheAssocie == Session.Labyrinth.prochainecase) {
                    Actions[i].CaseGrapheAssocie = new Case("placeHolder");
                    Actions[i].repaint();
                }
            }
        }
    }

    private void Top1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Top1;
            Top1.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Top1";
        }
    }

    private void Top2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Top2;
            Top2.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Top2";
        }
    }

    private void Top3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Top3;
            Top3.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Top3";
        }
    }

    private void Bottom1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Bottom1;
            Bottom1.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Bottom1";
        }
    }

    private void Bottom2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Bottom2;
            Bottom2.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Bottom2";
        }
    }

    private void Bottom3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Bottom3;
            Bottom3.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Bottom3";
        }
    }

    private void Left1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Left1;
            Left1.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Left1";
        }
    }

    private void Left2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Left2;
            Left2.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Left2";
        }
    }

    private void Left3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Left3;
            Left3.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Left3";
        }
    }

    private void Right1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Right1;
            Right1.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Right1";
        }
    }

    private void Right2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Right2;
            Right2.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Right2";
        }
    }

    private void Right3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (placement) {
            SwitchCase();
            boutonselectionne = Right3;
            Right3.CaseGrapheAssocie = Session.Labyrinth.prochainecase;

            action = "Right3";
        }
    }

    private void btn_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HelpActionPerformed

    private void RotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateActionPerformed
        // TODO add your handling code here:
        if (placement) {
            if (boutonselectionne == null) {
                return;
            }
            boutonselectionne.CaseGrapheAssocie.TurnCase(90);
            boutonselectionne.repaint();
        }
    }//GEN-LAST:event_RotateActionPerformed

    private void ValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateActionPerformed
        if (placement) {
            switch (action) {
                case "Top1" ->
                    Session.Labyrinth.DecalerColonne(2, true);
                case "Top2" ->
                    Session.Labyrinth.DecalerColonne(4, true);
                case "Top3" ->
                    Session.Labyrinth.DecalerColonne(6, true);
                case "Bottom1" ->
                    Session.Labyrinth.DecalerColonne(2, false);
                case "Bottom2" ->
                    Session.Labyrinth.DecalerColonne(4, false);
                case "Bottom3" ->
                    Session.Labyrinth.DecalerColonne(6, false);
                case "Left1" ->
                    Session.Labyrinth.DecalerLigne(2, true);
                case "Left2" ->
                    Session.Labyrinth.DecalerLigne(4, true);
                case "Left3" ->
                    Session.Labyrinth.DecalerLigne(6, true);
                case "Right1" ->
                    Session.Labyrinth.DecalerLigne(2, false);
                case "Right2" ->
                    Session.Labyrinth.DecalerLigne(4, false);
                case "Right3" ->
                    Session.Labyrinth.DecalerLigne(6, false);
                default -> {
                    return;
                }
            }
            Component[] components = Labyrinth.getComponents();
            for (int index = 0; index < components.length; index++) {
                int i = index / 7;
                int j = index % 7;
                Component comp = components[index];
                if (comp instanceof CaseGraphique) {
                    CaseGraphique caseGraphique = (CaseGraphique) comp;
                    caseGraphique.CaseGrapheAssocie = Session.Labyrinth.Grid[i][j];
                }
            }
            Labyrinth.repaint();
            CasePlacee();
        }
    }//GEN-LAST:event_ValidateActionPerformed

    public void CasePlacee() {
        placement = false;
        deplacement = true;
    }

    /**
     * Termine la partie, quand un joueur a gagné
     *
     * @param joueurGagnant Le joueur qui a gangé
     */
    public void partieTerminee(Player joueurGagnant) {
        CasePlacee();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChronoJeu;
    private javax.swing.JLabel Chrono_J1;
    private javax.swing.JLabel Chrono_J2;
    private javax.swing.JLabel Chrono_J3;
    private javax.swing.JLabel Chrono_J4;
    private javax.swing.JPanel Labyrinth;
    private javax.swing.JPanel Pane_Info;
    private javax.swing.JPanel Pane_J1;
    private javax.swing.JPanel Pane_J2;
    private javax.swing.JPanel Pane_J3;
    private javax.swing.JPanel Pane_J4;
    private javax.swing.JButton Rotate;
    private javax.swing.JButton Validate;
    private javax.swing.JButton btn_Help;
    private javax.swing.JLabel lbl_ChronoJeu;
    private javax.swing.JLabel lbl_ChronoTour;
    private javax.swing.JLabel lbl_J1;
    private javax.swing.JLabel lbl_J2;
    private javax.swing.JLabel lbl_J3;
    private javax.swing.JLabel lbl_J4;
    private javax.swing.JLabel lbl_JoueurCourant;
    private javax.swing.JLabel lbl_NomJoueur;
    private javax.swing.JLabel lbl_Objet_J1;
    private javax.swing.JLabel lbl_Objet_J2;
    private javax.swing.JLabel lbl_Objet_J3;
    private javax.swing.JLabel lbl_Objet_J4;
    private javax.swing.JLabel lbl_nextCard;
    private javax.swing.JLabel lbl_nextCase;
    private javax.swing.JLabel lbl_nomJ1;
    private javax.swing.JLabel lbl_nomJ2;
    private javax.swing.JLabel lbl_nomJ3;
    private javax.swing.JLabel lbl_nomJ4;
    private javax.swing.JLabel lbl_txtChronoJ1;
    private javax.swing.JLabel lbl_txtChronoJ2;
    private javax.swing.JLabel lbl_txtChronoJ3;
    private javax.swing.JLabel lbl_txtChronoJ4;
    private javax.swing.JLabel lbl_txtObjetJ1;
    private javax.swing.JLabel lbl_txtObjetJ2;
    private javax.swing.JLabel lbl_txtObjetJ3;
    private javax.swing.JLabel lbl_txtObjetJ4;
    // End of variables declaration//GEN-END:variables
}
