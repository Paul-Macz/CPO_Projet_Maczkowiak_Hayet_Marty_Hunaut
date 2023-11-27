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
    Case caseassocie;
    ImageIcon araignee = new ImageIcon(getClass().getResource("/Img/Cases/araignee.png"));
    ImageIcon bague = new ImageIcon(getClass().getResource("/Img/Cases/bague.png"));
    ImageIcon bourse = new ImageIcon(getClass().getResource("/Img/Cases/bourse.png"));
    ImageIcon carteTresor = new ImageIcon(getClass().getResource("/Img/Cases/CarteTresor.png"));
    ImageIcon chandelier = new ImageIcon(getClass().getResource("/Img/Cases/chandelier.png"));
    ImageIcon chauvesouris = new ImageIcon(getClass().getResource("/Img/Cases/chauvesouris.png"));
    ImageIcon chouette = new ImageIcon(getClass().getResource("/Img/Cases/chouette.png"));
    ImageIcon cle = new ImageIcon(getClass().getResource("/Img/Cases/cle.png"));
    ImageIcon couronne = new ImageIcon(getClass().getResource("/Img/Cases/couronne.png"));
    ImageIcon crane = new ImageIcon(getClass().getResource("/Img/Cases/crane.png"));
    ImageIcon departB = new ImageIcon(getClass().getResource("/Img/Cases/departB.png"));
    ImageIcon departJ = new ImageIcon(getClass().getResource("/Img/Cases/departJ.png"));
    ImageIcon departR = new ImageIcon(getClass().getResource("/Img/Cases/departR.png"));
    ImageIcon departV = new ImageIcon(getClass().getResource("/Img/Cases/departV.png"));
    ImageIcon dragon = new ImageIcon(getClass().getResource("/Img/Cases/dragon.png"));
    ImageIcon epee = new ImageIcon(getClass().getResource("/Img/Cases/epee.png"));
    ImageIcon fantome = new ImageIcon(getClass().getResource("/Img/Cases/fantome.png"));
    ImageIcon fee = new ImageIcon(getClass().getResource("/Img/Cases/fee.png"));
    ImageIcon genie = new ImageIcon(getClass().getResource("/Img/Cases/genie.png"));
    ImageIcon gobelin = new ImageIcon(getClass().getResource("/Img/Cases/gobelin.png"));
    ImageIcon heaume = new ImageIcon(getClass().getResource("/Img/Cases/heaume.png"));
    ImageIcon lezard = new ImageIcon(getClass().getResource("/Img/Cases/lezard.png"));
    ImageIcon livre = new ImageIcon(getClass().getResource("/Img/Cases/livre.png"));
    ImageIcon papillon = new ImageIcon(getClass().getResource("/Img/Cases/papillon.png"));
    ImageIcon rat = new ImageIcon(getClass().getResource("/Img/Cases/rat.png"));
    ImageIcon saphir = new ImageIcon(getClass().getResource("/Img/Cases/saphir.png"));
    ImageIcon scarabee = new ImageIcon(getClass().getResource("/Img/Cases/scarabee.png"));
    ImageIcon tresor = new ImageIcon(getClass().getResource("/Img/Cases/tresor.png"));
    ImageIcon tuile1 = new ImageIcon(getClass().getResource("/Img/Cases/tuile1.png"));
    ImageIcon tuile2 = new ImageIcon(getClass().getResource("/Img/Cases/tuile2.png"));
    ImageIcon blank = new ImageIcon(getClass().getResource("/Img/Cases/placeHolder.png"));

    public CaseGraphique(Case caseassocie) {
        this.caseassocie = caseassocie;
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
