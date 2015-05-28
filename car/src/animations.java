
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class animations extends JFrame implements Runnable{
    JLabel p1,p2,p3;
    public animations()
    {
    p1=new JLabel();
    p2=new JLabel();
    p3=new JLabel();
    setSize(800,800);
    setLayout(null);
    setVisible(true);
    Image_animate p1=new Image_animate(new ImageIcon("g:/i1.jpg").getImage());
    p1.setBackground(Color.red);
    this.add(p1);
    p1.setVisible(false);
    Image_animate p2=new Image_animate(new ImageIcon("g:/i2.jpg").getImage());
    
    this.add(p2);
    p1.setVisible(false);
    Image_animate p3=new Image_animate(new ImageIcon("g:/i3.jpg").getImage());
    p1.setBackground(Color.red);
    this.add(p3);
    p1.setVisible(false);
    try{
        Thread th=new Thread();
        th.start();
        for(int i=0;i<=100;i++){
        run();
        p1.setBounds(10,400,800,800);
        p1.setVisible(true);
        p2.setBounds(10,400,800,800);
        p2.setVisible(false);
        p3.setBounds(10,400,500,800);
        p3.setVisible(false);
        run();
         p1.setBounds(10,400,800,800);
        p1.setVisible(false);
        p2.setBounds(10,400,800,800);
        p2.setVisible(true);
        p3.setBounds(10,400,500,800);
        p3.setVisible(false);
        run();
         p1.setBounds(10,400,800,800);
        p1.setVisible(false);
        p2.setBounds(10,400,800,800);
        p2.setVisible(false);
        p3.setBounds(10,400,500,800);
        p3.setVisible(true);
                
                repaint();
        }
    }catch(Exception ex){
    }
    }
    public static void main(String []args)
    {
        animations ob=new animations();
    }
    
    
    
    
    
    
    
    
        
        
        
    
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            Logger.getLogger(animations.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }
   
    }
    

