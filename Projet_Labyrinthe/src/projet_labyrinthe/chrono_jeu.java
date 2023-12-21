/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_labyrinthe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import  javax.swing.Timer;
/**
 *
 * @author owenh
 */
public class chrono_jeu extends javax.swing.JFrame {

    public Timer t = new Timer(10, new Check());
       
  

    public int min = 0;
    public int sec= 0 ;
    public int ms = 0 ;
    
    public chrono_jeu() {
        initComponents();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnReset = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        jLabelMS = new javax.swing.JLabel();
        jLabelSEC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMIN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BtnReset.setBackground(new java.awt.Color(0, 51, 153));
        BtnReset.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        BtnReset.setText("Reset");
        BtnReset.setFocusPainted(false);
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        BtnStart.setBackground(new java.awt.Color(0, 0, 153));
        BtnStart.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        BtnStart.setText("Start");
        BtnStart.setFocusPainted(false);
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        jLabelMS.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabelMS.setForeground(new java.awt.Color(153, 153, 255));
        jLabelMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMS.setText("00");

        jLabelSEC.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabelSEC.setForeground(new java.awt.Color(153, 153, 255));
        jLabelSEC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSEC.setText("00");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel2.setText(":");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setText(":");

        jLabelMIN.setBackground(new java.awt.Color(153, 204, 255));
        jLabelMIN.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabelMIN.setForeground(new java.awt.Color(153, 153, 255));
        jLabelMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMIN.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSEC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMS, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMIN)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReset)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
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
    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        min = 0;
        sec= 0 ;
        ms = 0;
        jLabelMIN.setText("00");
        jLabelMIN.setText("00");
        jLabelMIN.setText("00");
        t.stop();
        BtnStart.setText("Start");

    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        if (BtnStart.getText().equals("Start")){
            BtnStart.setText( "Stop");
            t.start();
        }else{
            BtnStart.setText( "Start");
            t.stop();
        }
    }//GEN-LAST:event_BtnStartActionPerformed
    
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
            java.util.logging.Logger.getLogger(chrono_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chrono_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chrono_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chrono_jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chrono_jeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMIN;
    private javax.swing.JLabel jLabelMS;
    private javax.swing.JLabel jLabelSEC;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
