/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 *
 * @author lukha
 */
public class CaseGraphique extends JButton {

    Case CaseGrapheAssocie;
    int nblignes;
    int nbcolonnes;
    int posX;
    int posY;

    public CaseGraphique(Case CaseGrapheAssocie) {
        this.CaseGrapheAssocie = CaseGrapheAssocie;
    }
    
    private CaseGraphique(Case CaseGrapheAssocie,int i,int j){
        this.CaseGrapheAssocie = CaseGrapheAssocie;
        this.posX=i;
        this.posY=j;
    }
    
     public static CaseGraphique createInstance(Case CaseGrapheAssocie, int i, int j) {
        return new CaseGraphique(CaseGrapheAssocie, i, j);
    }

    /**
     * Redessine la case associé avec l'image souhaitée
     *
     * @param G
     */
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        BufferedImage image = null;
        /* Lecture de l'image correspondante (attention aux exceptions) */
        try {
            if (CaseGrapheAssocie != null && CaseGrapheAssocie.object != null) {
                // Load image using class loader
                String imagePath = "/Img/Cases/" + CaseGrapheAssocie.object + ".png";
                image = ImageIO.read(getClass().getResource(imagePath));
            } else {
                System.out.println("CaseGrapheAssocie or its object is null");
            }
        } catch (IOException ex) {
            System.out.print("glitched case: " + (CaseGrapheAssocie != null ? CaseGrapheAssocie.object : "null"));
            ex.printStackTrace();
        }
        Graphics2D g = (Graphics2D) G;
        double scaleX = (double) Interface.CaseSize / image.getWidth();
        double scaleY = (double) Interface.CaseSize / image.getHeight();

        // Create an AffineTransform for scaling
        AffineTransform tx = AffineTransform.getScaleInstance(scaleX, scaleY);

        // Rotate the scaled image
        tx.rotate(Math.toRadians(CaseGrapheAssocie.orientation), image.getWidth() / 2, image.getHeight() / 2);

        g.drawImage(image, tx, null);

        if (CaseGrapheAssocie.presenceJoueurs()) {
            for (Peon pion : CaseGrapheAssocie.Players) {
                BufferedImage imagePion = null;
                try {
                    imagePion = ImageIO.read(new File("src/Img/Pion/Heaume_" + pion.couleur + ".png"));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                double translateX = (Interface.CaseSize) / 2.0;
                double translateY = (Interface.CaseSize) / 2.0;

                double scaleX2 = (double) Interface.CaseSize / (2.0* imagePion.getWidth());
                double scaleY2 = (double) Interface.CaseSize / (2.0* imagePion.getHeight());

                int scaledWidth = (int) (imagePion.getWidth() * scaleX2);
                int scaledHeight = (int) (imagePion.getHeight() * scaleY2);
                int x = (Interface.CaseSize - scaledWidth) / 2;
                int y = (Interface.CaseSize - scaledHeight) / 2;
                g.drawImage(imagePion,x,y,scaledWidth,scaledHeight, null);
            }
        }
    }

}
