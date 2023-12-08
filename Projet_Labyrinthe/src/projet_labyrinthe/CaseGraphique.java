/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_labyrinthe;

import java.awt.Graphics;
import java.awt.Image;
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

    public CaseGraphique(Case CaseGrapheAssocie, int nblignes, int nbcolonnes) {
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
        
    }
    
    
}
