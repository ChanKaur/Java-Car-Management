import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;

        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * attendence.java
 *
 * Created on Jul 17, 2013, 3:00:22 PM
 */
/**
 *
 * @author DELL
 */
public class attendence extends javax.swing.JFrame {
    

    /** Creates new form attendence */
    public attendence() {
        
        initComponents();
        setSize(400,400);
        
        try{
        Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
        ResultSet rs=con.createStatement().executeQuery("select name from employee_registration");
        while(rs.next()){
            jComboBox1.addItem(rs.getString(1));
        }}catch(Exception ex){
            
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 210, 90, 40);

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("NAME OF EMPLOYEE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 26, 139, 30);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 30, 123, 20);

        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("DATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 86, 70, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(167, 83, 123, 30);

        jRadioButton1.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton1.setText("PRESENT");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(32, 146, 100, 40);

        jRadioButton2.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton2.setText("ABSENT");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(170, 140, 90, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\images (17).jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 310, 260);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 310, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    String st="";
  if(jRadioButton1.isSelected()){
      st="PRESENT";
  }
  else if(jRadioButton2.isSelected()){
      st="ABSENT";
  }
  Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("update attendence set "+jComboBox1.getSelectedItem()+" ='"+st+"' where day="+jComboBox2.getSelectedItem()+"");
JOptionPane.showMessageDialog(this,"ATTENDENCE MARKED");
}catch(Exception ex){
       
  }

  // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String d=jComboBox1.getSelectedItem().toString();
try{
    Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
con.createStatement().executeUpdate("alter table attendence  add "+d+" varchar(40)");
}catch(Exception ex){
    System.out.println(""+ex);
}
    

}//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new attendence().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
