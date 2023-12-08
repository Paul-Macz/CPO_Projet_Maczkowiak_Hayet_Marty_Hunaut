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
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lukha
 */
public class CaseGraphique extends JButton{
    Case CaseGrapheAssocie;
    int nblignes;
    int nbcolonnes;

    public CaseGraphique(Case CaseGrapheAssocie) {
        this.CaseGrapheAssocie = CaseGrapheAssocie;
        this.nblignes = nblignes;
        this.nbcolonnes = nbcolonnes;
    }   

    /**
     * Modifie la taille d'une image et la renvoie sous forme d'icone
     * @param Img Correspond à l'image d'origine
     * @param width La largeur souhaitée
     * @param height La hauteur souhaitée
     * @return
     */
    public static ImageIcon getScaledIcon(ImageIcon Img, int width, int height ){
        
        Image srcImage = Img.getImage();
        
        Image resizedImage = srcImage.getScaledInstance(width, height,
                Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        return resizedIcon;
    }
    
    /**
     * Redessine la case associé avec l'image souhaitée
     * @param G
     */
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        BufferedImage image = null;
		/* Lecture de l'image correspondante (attention aux exceptions) */
		try {   
                    System.out.print(CaseGrapheAssocie.object);
			image = ImageIO.read(new File("src/Img/Cases" + CaseGrapheAssocie.object + ".png"));
		} catch (IOException ex) {
			//Logger.getLogger(CaseGraphique.class.getName()).log(Level.SEVERE, null, ex);
		}
		Graphics2D g = (Graphics2D) G;
		/* Cette méthode permet de ne pas tourner toute l'iamge du bouton, et donc
		que les pions restent droits */
                /* Création d'une transformation affine de rotation de l'angle indiqué autour
		du centre de l'image */
		AffineTransform tx = AffineTransform.getRotateInstance(Math.toRadians(CaseGrapheAssocie.orientation), image.getWidth() / 2, image.getHeight() / 2);
		/* Affichage de l'image tournée */
		g.drawImage(image, tx, null);
		/* Rotation de l'image de l'angle indiqué autour de son centre */
		/* Affichage de l'image transformée précedement sur place */
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
    
    

