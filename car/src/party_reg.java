import java.awt.Dimension;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * party.java
 *
 * Created on Jul 10, 2013, 3:15:29 PM
 */
/**
 *
 * @author DELL
 */
public class party_reg extends javax.swing.JFrame {

    /** Creates new form party */
    public party_reg() {
         setPreferredSize(new Dimension(600,530));
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SPARE PARTS DEALER REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 0, 290, 42);

        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("DEALER NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(79, 60, 120, 30);

        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("CONTACT NUMBER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 220, 130, 30);

        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("SPARE PARTS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 130, 110, 28);

        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 300, 80, 30);

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("EMAIL-ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 400, 90, 29);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(246, 60, 166, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(246, 405, 166, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(246, 108, 166, 69);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(246, 286, 166, 69);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(246, 216, 166, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(111, 470, 118, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(267, 470, 119, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\New folder\\bg-.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 650, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("insert into party_registration values('"+jTextField1.getText()+"','"+jTextArea1.getText()+"','"+jTextField4.getText()+"','"+jTextArea2.getText()+"','"+jTextField3.getText()+"')");
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
    }
}
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1FocusLost

private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
String k4=jTextField4.getText();
if(k4.isEmpty())
{
    JOptionPane.showMessageDialog(this, "plz fill this filed");
    jTextField4.requestFocus();
}
else{
    if(!Pattern.matches("[0-9]+", k4))
    {
         JOptionPane.showMessageDialog(this, "enter only numeric");
         jTextField4.requestFocus();
         jTextField4.setText("");
    }
}// TODO add your handling code here:
}//GEN-LAST:event_jTextField4FocusLost

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
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
