import java.awt.Dimension;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ACC_REGISTRATION.java
 *
 * Created on Jul 10, 2013, 3:48:40 PM
 */
/**
 *
 * @author DELL
 */
public class ACC_REGISTRATION extends javax.swing.JFrame {
    public ACC_REGISTRATION() {
        setPreferredSize(new Dimension(600,600));
        initComponents();
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACCESSORIES DEALER REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 310, 40);

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("DEALER NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 70, 120, 20);

        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("ACCESSORIES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 130, 120, 14);

        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("CONTACT NUMBER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 210, 130, 14);

        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 280, 120, 14);

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("EMAIL-ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 360, 90, 14);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(303, 68, 166, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(303, 119, 166, 70);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(303, 210, 166, 40);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(303, 272, 166, 50);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(303, 357, 170, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 420, 160, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 470, 160, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\logo.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-80, 20, 580, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("insert into accdealer_registration values('"+jTextField1.getText()+"','"+jTextArea1.getText()+"','"+jTextField2.getText()+"','"+jTextArea2.getText()+"','"+jTextField3.getText()+"')");

     JOptionPane.showMessageDialog(this,"Records inserted successfully");  
     this.dispose();
        
}
catch(Exception ex){
}                  // TODO add your handling code here:
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
}// TODO add your handling code here:
}//GEN-LAST:event_jTextField2FocusLost

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
    }// TODO add your handling code here:
}//GEN-LAST:event_jTextField1FocusLost
}
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
