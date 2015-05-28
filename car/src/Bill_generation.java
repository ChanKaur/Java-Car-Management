
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Bill_generation.java
 *
 * Created on Jul 30, 2013, 10:14:31 AM
 */
/**
 *
 * @author DELL
 */
public class Bill_generation extends javax.swing.JFrame implements Printable{
private String printData;JButton print;JFrame jf=this;
    /** Creates new form Bill_generation */
    public Bill_generation(String cust,ArrayList<String> ar,ArrayList<String> qua,ArrayList<Integer> co,int total,String date,String printDataIn) {
       
        JLabel l4=new JLabel("Total amount");
         JLabel l3=new JLabel(String.valueOf(total));
          this.printData = printDataIn;
        setPreferredSize(new Dimension(600, 600));
        int y=100;
        initComponents();
        jLabel2.setText(cust);
        for(int i=0;i<ar.size();i++){
            
            JLabel l1=new JLabel(ar.get(i));
            JLabel l2=new JLabel(qua.get(i));
            JLabel l7=new JLabel(String.valueOf(co.get(i)));
            l1.setBounds(20,y,150,30);
            l2.setBounds(225,y,150,30);
            l7.setBounds(350,y,150,30);
            add(l1);
            add(l2);
            add(l7);
            y=y+40;
        }
        JLabel l5=new JLabel("Date");
        l4.setBounds(20,y,350,30);
        l3.setBounds(195,y,350,30);
        l5.setBounds(20,y+40,150,30);
        add(l5);
        add(l3);
        add(l4);
        JLabel l6=new JLabel(date);
        l6.setBounds(210,y+40,150,30);
        add(l6);
        print=new JButton("Print");
        print.setBounds(230,y+100,80,30);
        add(print);
        print.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("print");
                PrinterJob printJob = PrinterJob.getPrinterJob();
           printJob.setPrintable((Printable) jf);
    if (printJob.printDialog())
      try { 
        printJob.print();
      } catch(PrinterException pe) {
        System.out.println("Error printing: " + pe);
      }
            }
        });
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CUSTOMER NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 27, 120, 28);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 27, 167, 28);

        jLabel3.setText("ACCESSORIES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 100, 30);

        jLabel4.setText("QTY");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 80, 50, 20);

        jLabel5.setText("COST");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 80, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
       /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Bill_generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Bill_generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Bill_generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Bill_generation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
       /* Create and display the form */
    //  java.awt.EventQueue.invokeLater(new Runnable() {//
           // @Override
        //  public void run() 
          // { 
              // new Bill_generation().setVisible(true);//
        //  }  //
      //
              
              
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

   
    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
       {
        if (pageIndex > 0) {
         
        } else {
          Graphics2D g2d = (Graphics2D)g;
          g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
      
          // Turn double buffering back on
          
        }
    return 0;
      }
    }  
}
