/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_labyrinthe;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static projet_labyrinthe.Interface.ScreenDim;

/**
 *
 * @author Asus
 */
public class Accueil extends javax.swing.JFrame {
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        setSize(ScreenDim.width, ScreenDim.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
            TEXTNOM2.setVisible(false);
            Lab3.setVisible(false);
            Lab4.setVisible(false);
            LISTCOLOR2.setVisible(false);
            TEXTNOM3.setVisible(false);
            Lab5.setVisible(false);
            Lab6.setVisible(false);
            LISTCOLOR3.setVisible(false);
            TEXTNOM4.setVisible(false);
            Lab7.setVisible(false);
            Lab8.setVisible(false);
            LISTCOLOR4.setVisible(false);
       
            Spinner.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
            int P = (int) Spinner.getValue();
            if ((int) Spinner.getValue()==1){
            TEXTNOM1.setVisible(true);
            Lab1.setVisible(true);
            Lab2.setVisible(true);
            LISTCOLOR1.setVisible(true);
            TEXTNOM2.setVisible(false);
            Lab3.setVisible(false);
            Lab4.setVisible(false);
            LISTCOLOR2.setVisible(false);
            TEXTNOM3.setVisible(false);
            Lab5.setVisible(false);
            Lab6.setVisible(false);
            LISTCOLOR3.setVisible(false);
            TEXTNOM4.setVisible(false);
            Lab7.setVisible(false);
            Lab8.setVisible(false);
            LISTCOLOR4.setVisible(false);
        } else if (P==2){
            TEXTNOM1.setVisible(true);
            Lab1.setVisible(true);
            Lab2.setVisible(true);
            LISTCOLOR1.setVisible(true);
            TEXTNOM2.setVisible(true);
            Lab3.setVisible(true);
            Lab4.setVisible(true);
            LISTCOLOR2.setVisible(true);  
            TEXTNOM3.setVisible(false);
            Lab5.setVisible(false);
            Lab6.setVisible(false);
            LISTCOLOR3.setVisible(false);
            TEXTNOM4.setVisible(false);
            Lab7.setVisible(false);
            Lab8.setVisible(false);
            LISTCOLOR4.setVisible(false);
        } else if (P==3){
            TEXTNOM1.setVisible(true);
            Lab1.setVisible(true);
            Lab2.setVisible(true);
            LISTCOLOR1.setVisible(true);
            TEXTNOM2.setVisible(true);
            Lab3.setVisible(true);
            Lab4.setVisible(true);
            LISTCOLOR2.setVisible(true);
            TEXTNOM3.setVisible(true);
            Lab5.setVisible(true);
            Lab6.setVisible(true);
            LISTCOLOR3.setVisible(true);
            TEXTNOM4.setVisible(false);
            Lab7.setVisible(false);
            Lab8.setVisible(false);
            LISTCOLOR4.setVisible(false);
        } else if (P==4){
            TEXTNOM1.setVisible(true);
            Lab1.setVisible(true);
            Lab2.setVisible(true);
            LISTCOLOR1.setVisible(true);
            TEXTNOM2.setVisible(true);
            Lab3.setVisible(true);
            Lab4.setVisible(true);
            LISTCOLOR2.setVisible(true);
            TEXTNOM3.setVisible(true);
            Lab5.setVisible(true);
            Lab6.setVisible(true);
            LISTCOLOR3.setVisible(true);
            TEXTNOM4.setVisible(true);
            Lab7.setVisible(true);
            Lab8.setVisible(true);
            LISTCOLOR4.setVisible(true);
       
        }
        if (P==1){
            String Nom1 = TEXTNOM1.getText();  
            String Couleur1 = (String) LISTCOLOR1.getSelectedItem();
        } else if (P==2){
            String Nom1 = TEXTNOM1.getText();
            String Nom2 = TEXTNOM2.getText();
            String Couleur1 = (String) LISTCOLOR1.getSelectedItem();
            String Couleur2 = (String) LISTCOLOR2.getSelectedItem();
        } else if (P==3){
            String Nom1 = TEXTNOM1.getText();
            String Nom2 = TEXTNOM2.getText();
            String Nom3 = TEXTNOM1.getText();
            String Couleur1 = (String) LISTCOLOR1.getSelectedItem();
            String Couleur2 = (String) LISTCOLOR2.getSelectedItem();
            String Couleur3 = (String) LISTCOLOR3.getSelectedItem();
        } else if (P==4){
            String Nom1 = TEXTNOM1.getText();
            String Nom2 = TEXTNOM2.getText();
            String Nom3 = TEXTNOM1.getText();
            String Nom4 = TEXTNOM1.getText();
            String Couleur1 = (String) LISTCOLOR1.getSelectedItem();
            String Couleur2 = (String) LISTCOLOR2.getSelectedItem();
            String Couleur3 = (String) LISTCOLOR3.getSelectedItem();
            String Couleur4 = (String) LISTCOLOR4.getSelectedItem();
        }}
            });
           
           
       
     
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        PAN1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Spinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text1 = new javax.swing.JTextPane();
        Lab1 = new javax.swing.JLabel();
        Lab2 = new javax.swing.JLabel();
        Lab3 = new javax.swing.JLabel();
        Lab4 = new javax.swing.JLabel();
        TEXTNOM2 = new javax.swing.JTextField();
        Lab5 = new javax.swing.JLabel();
        TEXTNOM3 = new javax.swing.JTextField();
        Lab6 = new javax.swing.JLabel();
        TEXTNOM1 = new javax.swing.JTextField();
        Lab7 = new javax.swing.JLabel();
        TEXTNOM4 = new javax.swing.JTextField();
        Lab8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        LISTCOLOR1 = new javax.swing.JComboBox<>();
        LISTCOLOR2 = new javax.swing.JComboBox<>();
        LISTCOLOR3 = new javax.swing.JComboBox<>();
        LISTCOLOR4 = new javax.swing.JComboBox<>();
        Fond = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PAN1.setBackground(new java.awt.Color(0, 0, 51));

        jToggleButton1.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("Lancer");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        Spinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Spinner.setName(""); // NOI18N

        Text1.setBackground(new java.awt.Color(0, 0, 102));
        Text1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Text1.setText("Nombre de Joueurs");
        jScrollPane1.setViewportView(Text1);

        Lab1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab1.setText("Nom du premier Joueur ");

        Lab2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab2.setText("Couleur :");

        Lab3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab3.setText("Nom du premier Joueur ");

        Lab4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab4.setText("Couleur :");

        TEXTNOM2.setBackground(new java.awt.Color(51, 0, 102));
        TEXTNOM2.setText("Nom");

        Lab5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab5.setText("Nom du premier Joueur ");

        TEXTNOM3.setBackground(new java.awt.Color(51, 0, 102));
        TEXTNOM3.setText("Nom");

        Lab6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab6.setText("Couleur :");

        TEXTNOM1.setBackground(new java.awt.Color(51, 0, 102));
        TEXTNOM1.setText("Nom");

        Lab7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab7.setText("Nom du premier Joueur ");

        TEXTNOM4.setBackground(new java.awt.Color(51, 0, 102));
        TEXTNOM4.setText("Nom");

        Lab8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Lab8.setText("Couleur :");

        jToggleButton2.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setText("Quitter");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        LISTCOLOR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rouge", "Jaune ", "Vert", "Bleu" }));

        LISTCOLOR2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rouge", "Jaune ", "Vert", "Bleu" }));

        LISTCOLOR3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rouge", "Jaune ", "Vert", "Bleu" }));

        LISTCOLOR4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rouge", "Jaune ", "Vert", "Bleu" }));

        javax.swing.GroupLayout PAN1Layout = new javax.swing.GroupLayout(PAN1);
        PAN1.setLayout(PAN1Layout);
        PAN1Layout.setHorizontalGroup(
            PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAN1Layout.createSequentialGroup()
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAN1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addGroup(PAN1Layout.createSequentialGroup()
                        .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PAN1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PAN1Layout.createSequentialGroup()
                                        .addComponent(Lab3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXTNOM2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lab4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LISTCOLOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PAN1Layout.createSequentialGroup()
                                        .addComponent(Lab5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXTNOM3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lab6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LISTCOLOR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PAN1Layout.createSequentialGroup()
                                        .addComponent(Lab7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXTNOM4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lab8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LISTCOLOR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PAN1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PAN1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lab1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEXTNOM1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Lab2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LISTCOLOR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PAN1Layout.setVerticalGroup(
            PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAN1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Spinner)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab1)
                    .addComponent(Lab2)
                    .addComponent(TEXTNOM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LISTCOLOR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab3)
                    .addComponent(TEXTNOM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab4)
                    .addComponent(LISTCOLOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab6)
                    .addComponent(TEXTNOM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab5)
                    .addComponent(LISTCOLOR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab7)
                    .addComponent(TEXTNOM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab8)
                    .addComponent(LISTCOLOR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(PAN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap())
        );

        getContentPane().add(PAN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 360));

        //Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_labyrinthe/5008c241263635.579f73a622fe3.gif"))); // NOI18N
        Fond.setText("jLabel1");
        getContentPane().add(Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 380));

        pack();
    }// </editor-fold>                        

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        new Interface().setVisible(true);
       
        this.dispose();
    }                                              

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.dispose();
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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JLabel Fond;
    private javax.swing.JComboBox<String> LISTCOLOR1;
    private javax.swing.JComboBox<String> LISTCOLOR2;
    private javax.swing.JComboBox<String> LISTCOLOR3;
    private javax.swing.JComboBox<String> LISTCOLOR4;
    private javax.swing.JLabel Lab1;
    private javax.swing.JLabel Lab2;
    private javax.swing.JLabel Lab3;
    private javax.swing.JLabel Lab4;
    private javax.swing.JLabel Lab5;
    private javax.swing.JLabel Lab6;
    private javax.swing.JLabel Lab7;
    private javax.swing.JLabel Lab8;
    private javax.swing.JPanel PAN1;
    private javax.swing.JSpinner Spinner;
    private javax.swing.JTextField TEXTNOM1;
    private javax.swing.JTextField TEXTNOM2;
    private javax.swing.JTextField TEXTNOM3;
    private javax.swing.JTextField TEXTNOM4;
    private javax.swing.JTextPane Text1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration                  
}