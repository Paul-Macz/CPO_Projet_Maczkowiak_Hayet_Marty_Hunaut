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

    public CaseGraphique(Case CaseGrapheAssocie) {
        this.CaseGrapheAssocie = CaseGrapheAssocie;
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
        tx.rotate(Math.toRadians(CaseGrapheAssocie.orientation), Interface.CaseSize / 2, Interface.CaseSize / 2);

        g.drawImage(image, tx, null);

        /*if (CaseGrapheAssocie.presencePion()) {
			for (Peon pion : CaseGrapheAssocie.Players) {
				BufferedImage imagePion = null;
				try {
					imagePion = ImageIO.read(new File("src/Img/pion" + pion.couleur + ".png"));
				} catch (IOException ex) {
				//	Logger.getLogger(CaseGraphique.class.getName()).log(Level.SEVERE, null, ex);
				}
				g.drawImage(imagePion, 0, 0, null);
			}
		}*/
    }

}
