
import java.awt.Dimension;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CUSTOMER_REG.java
 *
 * Created on Jul 10, 2013, 4:09:14 PM
 */
/**
 *
 * @author DELL
 */
public class CUSTOMER_REG extends javax.swing.JFrame {

    /** Creates new form CUSTOMER_REG */
    public CUSTOMER_REG() {
        setPreferredSize(new Dimension(480,500));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setText("CUSTOMER REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 0, 210, 47);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMER NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 100, 130, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTACT NUMBER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 200, 130, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 290, 130, 32);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 90, 190, 45);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(260, 180, 190, 58);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 290, 190, 60);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 390, 91, 23);

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 390, 83, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\Untitled.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 520, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("insert into customer_registration values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextArea1.getText()+"')");
JOptionPane.showMessageDialog(this,"Records inserted successfully");   
       this.dispose();
}
catch(Exception ex){
    System.out.print(ex);
}
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
String k1=jTextField1.getText();

if(k1.isEmpty())
{
    JOptionPane.showMessageDialog(this, "Plz fill this field");
    jTextField1.requestFocus();
    
}
else{
    if(!Pattern.matches("[A-za-z]+", k1))
    {
         JOptionPane.showMessageDialog(this, "Not a valid entry,Enter only alphabets");
         jTextField1.requestFocus();
         jTextField1.setText("");
    } }// TODO add your handling code// TODO add your handling code here:
}//GEN-LAST:event_jTextField1FocusLost

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
