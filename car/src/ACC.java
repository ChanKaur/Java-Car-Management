
import java.awt.Dimension;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ACC.java
 *
 * Created on Jul 10, 2013, 5:55:19 PM
 */
/**
 *
 * @author DELL
 */
public class ACC extends javax.swing.JFrame {
    /** Creates new form ACC */
 
   
    public ACC() {
         setPreferredSize(new Dimension(400,450));
        initComponents();
         
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ACCESSORIES REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(107, 11, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("ACCESSORY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("COST");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 70, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(156, 65, 166, 40);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(156, 134, 166, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(81, 327, 100, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(204, 327, 100, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("DESCRIPTION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 220, 100, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(156, 198, 166, 68);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\stock-photo-car-113848408.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 420, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("insert into acc_reg values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextArea1.getText()+"')");
JOptionPane.showMessageDialog(this,"Records inserted successfully");
this.dispose();
}catch(Exception ex){
    
}// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
String k4=jTextField2.getText();
if(k4.isEmpty())
{
    JOptionPane.showMessageDialog(this, "Please fill this field");
    jTextField2.requestFocus();
}
else{
    if(!Pattern.matches("[0-9]+", k4))
    {
         JOptionPane.showMessageDialog(this, "Not a valid detail,Enter only numerics");
         jTextField2.requestFocus();
         jTextField2.setText("");
    }
}// TODO add your handling code here:// TODO add your handling code here:
}//GEN-LAST:event_jTextField2FocusLost

    /**
     * @param args the command line arguments
     */
  //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
