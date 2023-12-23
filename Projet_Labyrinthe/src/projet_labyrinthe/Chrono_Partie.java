/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import  javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import static projet_labyrinthe.Interface.ScreenDim;
/**
 *
 * @authors Owen HAYET, Raphael MARTY, Oscar HUNAUT, Paul MACZKOWIAK
 */
public class Chrono_Partie {
    public Timer t = new Timer(10, new Chrono_Partie.Check());

    public int min = 0;
    public int sec= 0 ;
    public int ms = 0 ;
    
    /**
     * Creer le chrono de la partie
     * @param pane Le panel dans lequel sera place le chrono
     */
    public Chrono_Partie(JPanel pane) {
        initComponents(pane);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(JPanel pane) {

        Chrono_Partie = new javax.swing.JPanel();
        jLabelMS = new javax.swing.JLabel();
        jLabelSEC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMIN = new javax.swing.JLabel();


        Chrono_Partie.setBackground(new java.awt.Color(153,153,153));

        jLabelMIN.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabelMIN.setText("00");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel1.setText(":");

        jLabelSEC.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabelSEC.setText("00");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel2.setText(":");

        jLabelMS.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabelMS.setText("00");

        javax.swing.GroupLayout Chrono_J1Layout = new javax.swing.GroupLayout(Chrono_Partie);
        Chrono_Partie.setLayout(Chrono_J1Layout);
        Chrono_J1Layout.setHorizontalGroup(
            Chrono_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
            .addGroup(Chrono_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Chrono_J1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelMIN)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1)
                    .addGap(6, 6, 6)
                    .addComponent(jLabelSEC)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel2)
                    .addGap(6, 6, 6)
                    .addComponent(jLabelMS)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Chrono_J1Layout.setVerticalGroup(
            Chrono_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(Chrono_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Chrono_J1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(Chrono_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelMIN)
                        .addComponent(jLabel1)
                        .addComponent(jLabelSEC)
                        .addComponent(jLabel2)
                        .addComponent(jLabelMS))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pane.add(Chrono_Partie, new AbsoluteConstraints((ScreenDim.width) * 20 / 100, (ScreenDim.height)*8/100,150,34));

    }// </editor-fold>                        
                        
  
    class Check implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            ms+=1;
            if (ms== 100){
                sec+=1;
                ms=0;
            }
            if( sec==60){
                min+=1;
                sec=0;
            }
            if(ms<10){
                jLabelMS.setText("0" + ms);
            }else{
            jLabelMS.setText(String.valueOf(ms));
            }
            if(sec<10){
                jLabelSEC.setText("0" + sec);
            }else{
            jLabelSEC.setText(String.valueOf(sec));
            }
            if(min<10){
                jLabelMIN.setText("0" + min);
            }else{
            jLabelMIN.setText(String.valueOf(min));
            }
         }
    }
    
    /**
     * Lance le chrono
     */
    public void Start() {                                         
            t.start();
    }       
    
    public void Stop(){
        t.stop();
    }
    
    /**
     * Reinitialise le chrono
     */
    public void Reset(){
        min = 0;
        sec= 0 ;
        ms = 0;
        jLabelMIN.setText("00");
        jLabelMIN.setText("00");
        jLabelMIN.setText("00");
        Start();
    }
    
    // Variables declaration - do not modify                     
    public javax.swing.JPanel Chrono_Partie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMIN;
    private javax.swing.JLabel jLabelMS;
    private javax.swing.JLabel jLabelSEC;
    // End of variables declaration      
}
