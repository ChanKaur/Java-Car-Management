/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abc
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class detail_iform1 extends JFrame implements ActionListener,Printable 
{

    JFrame jf;
    JButton b = new JButton("Close");
      JButton pr = new JButton("Print");
    JPanel p;
    JScrollPane sp;
    JTable tab;
    int cid = 0;
    String table = "detail";
    DefaultTableModel tm;
    Object data[][];
    
    @SuppressWarnings("empty-statement")
    public detail_iform1() {
        jf = new JFrame("Defaulters List");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jf.setLayout(null);
        jf.setSize(800, 700);
        p = new JPanel();
        p.setLayout(null);
        p.setVisible(true);
        pr.setBounds(350,550, 80, 30);
        p.setBounds(10, 10, 600, 600);
        b.setBounds(200, 550, 80, 30);
        b.addActionListener(this);
        b.setMnemonic(KeyEvent.VK_C);
        Object col[] = {"Form_No", "Product_Name", "Sack_No","Weight","Rate","Amount"};
        try {
              Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finance","root","");
            Statement stmt = con.createStatement();
            String query = "SELECT Form_NO,Product_Name,Sack_no,Weight,Rate,Amount from i_form";
            ResultSet rs;
            rs = stmt.executeQuery("select count(*) from i_form");
            int i = 0;
            if (rs.next()) {
                i = rs.getInt(1);
            }
            data = new Object[i][6];
            rs = stmt.executeQuery(query);
            int j = 0;
            while (rs.next() && j <= i) {
                int h = 1;
                for (int k = 0; k < 6; k++) {
                    if (h == 1) {
                       // ResultSet rs1 = CM.con.createStatement().executeQuery("select Name from j_form where Form_No=" + rs.getString(1));
                      //  if (rs1.next()) {
                            data[j][k] = rs.getString(h);
                        //}
                    } else {
                        data[j][k] = rs.getString(h);
                    }

                    h++;
                }
                j++;
            }
            tab = new JTable(data, col);
            p.add(b);
            sp = new JScrollPane(tab);
            sp.setBounds(60, 50, 500, 500);
            p.add(sp);
            jf.add(p);
           p .add(pr);
         
           pr.addActionListener(this);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
 
    
public static void main(String []args)
{
    new detail_iform1();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        
        if(str.equalsIgnoreCase("Close"))
        {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want leave the form?", "Confirm Cancel", dialogButton);
        if (dialogResult == 0) {
            jf.dispose();
        }
        }
        else
        {
              PrinterJob printJob = PrinterJob.getPrinterJob();
    printJob.setPrintable((Printable) this);
    if (printJob.printDialog())
      try { 
        printJob.print();
      } catch(PrinterException pe) {
        System.out.println("Error printing: " + pe);
      }
        }
    }

    @Override
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
