/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author lukha
 */
public class CarteGraphique extends JComponent{
    Cartes CarteAssociee;

    public CarteGraphique(Cartes CarteAssociee) {
        this.CarteAssociee = CarteAssociee;
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
            if (CarteAssociee != null && CarteAssociee.nomObjet != null) {
                // Load image using class loader
                String imagePath = "/Img/Cartes/Carte_" + CarteAssociee.nomObjet + ".png";
                image = ImageIO.read(getClass().getResource(imagePath));
            } else {
                System.out.println("CaseGrapheAssocie or its object is null");
            }
        } catch (IOException ex) {
            System.out.print("glitched case: " + (CarteAssociee  != null ? CarteAssociee.nomObjet : "null"));
            ex.printStackTrace();
        }
        Graphics2D g = (Graphics2D) G;
        double scaleX = (double) Interface.CardSize / image.getWidth();
        double scaleY = (double) 1.5*Interface.CardSize / image.getHeight();

        // Create an AffineTransform for scaling
        AffineTransform tx = AffineTransform.getScaleInstance(scaleX, scaleY);
        
        g.drawImage(image, tx, null);
    }
}
