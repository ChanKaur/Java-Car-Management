/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
public class loadingbar_page extends JWindow {
   JPanel p1;  JLabel l1; JProgressBar pb;
    loadingbar_page()
    {
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        
        Toolkit tool=getToolkit();
        Dimension def=tool.getScreenSize();
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 700, 700);
        
        l1=new JLabel();
        l1.setLayout(null);
        l1.setBounds(0, 0, 700, 700);
        
        ImageIcon img=new ImageIcon(getClass().getResource("logo.jpg"));
        l1.setIcon(img);
        
        pb=new JProgressBar();
        pb.setLayout(null);
        pb.setBounds(0, 400, 700, 30);
        pb.setValue(0);
        pb.setStringPainted(true);
        l1.add(pb);
        pb.setVisible(true);
        
        
        p1.add(l1);
         l1.setVisible(true);
        
        add(p1);
        p1.setVisible(true);
        repaint();
        validate();
        call();
         
    }
    void call()
    {
        int x=0;
        while(x<=100)
        {
            try{
                Thread.sleep(500);
                pb.setValue(x);
                
            }
            catch(Exception eb)
            {
                System.out.print(eb);
            }
            x+=25;
           if(x==100)
            {
                login lb=new login();
                lb.setVisible(true);
                
            } 
        }
        if(x>=100)
        {
            this.setVisible(false);
        }
    }
    public static void main(String []args)
    {
       new  loadingbar_page();
        
    }
}
