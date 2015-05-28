
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
class Image_animate extends JPanel{
 private Image img;
 public Image_animate(String img) {
     this(new ImageIcon(img).getImage());
 } public Image_animate(Image img) { this.img=img; Dimension size = new Dimension(img.getWidth(null),img.getHeight(null)); setPreferredSize(size); setMinimumSize(size); setMaximumSize(size); setSize(size); setLayout(null); }@Override
 public void paintComponent(Graphics g) { g.drawImage(img,0,0,null,null); }} 

