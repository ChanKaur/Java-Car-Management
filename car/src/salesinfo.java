/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.font.*;

public class salesinfo  extends JFrame implements ActionListener 
{
	
	JLabel l0,lh1,lh2,lh3,lh4;
	JButton b1;
	Connection con ;
	Statement sta;
	ResultSet rs;
	Choice ch;
	int i=0,y=190;
Font f1;	
	JLabel []l1=new JLabel[100]; 
	JLabel []l2=new JLabel[100]; 
	JLabel []l3=new JLabel[100]; 
	JLabel []l4=new JLabel[100]; 
	
	public salesinfo()
	{
		
		setSize(1045,700);
		setVisible(true);
		setTitle("SALES Info REPORT");
		setSize(1045,700);
		getContentPane().setLayout(null);
	
		
		Font f = new Font("Andalus",Font.BOLD,34);
		Font f1 = new Font("Verdana",Font.BOLD,16);

		l0= new JLabel ("Sales Info REPORT");
		lh1= new JLabel ("CUSTOMER NAME");
		lh2= new JLabel ("SPARE PARTS");
		lh3= new JLabel ("TOTAL AMOUNT");
		lh4= new JLabel ("DATE OF ORDER");
		ch = new Choice();
		b1= new JButton ("Submit");
		b1.setMnemonic('t');
		
		
		ch.add("%");

	
	
		l0.setBounds(320,20,500,90);
		ch.setBounds(400,120,80,50);
		b1.setBounds(490,120,80,25);

		
		lh1.setBounds(50,150,170,110);
		lh2.setBounds(230,150,200,110);
		lh3.setBounds(450,150,250,110);
		lh4.setBounds(700,150,300,110);

		l0.setFont(f);
		lh1.setFont(f1);
		lh2.setFont(f1);
		lh3.setFont(f1);
		lh4.setFont(f1);	
	
		
		l0.setForeground(Color.RED);
		
		this.getContentPane().add(l0);
		this.getContentPane().add(ch);
		this.getContentPane().add(b1);
		
		
		this.getContentPane().add(lh1);
		this.getContentPane().add(lh2);
		this.getContentPane().add(lh3);
		this.getContentPane().add(lh4);
		//ff.getContentPane().add(l1[i]);
		
		
		b1.addActionListener(this);
		
		
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","");
			
		}
		catch(ClassNotFoundException sq)
		{
			JOptionPane.showConfirmDialog(this,sq.getMessage());
		}
		catch(SQLException sqe)
		{
			JOptionPane.showConfirmDialog(this,sqe.getMessage());
		}	
		try
		{
		sta = con.createStatement();	
                rs=sta.executeQuery("select distinct(date) from regorder_spare");
	        while (rs.next())
			{
				ch.add(rs.getString(1));
			}}
	catch(SQLException sqe)
	{
		JOptionPane.showConfirmDialog(this,sqe.getMessage());
	}	
			
}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
	
		if(str.equals("Submit"))
		{	i=0;
			try
			{
				
			sta = con.createStatement();	
				rs=sta.executeQuery("select * from regorder_spare where date='"+ch.getSelectedItem()+"'");
				while(rs.next()){
				
					l1[i] = new JLabel();
					l1[i].setText("");
					l1[i].setText(rs.getString(1));
					getContentPane().add(l1[i]);
					l1[i].setBounds(80,y,120,130);
					
					l2[i] = new JLabel();
					l2[i].setText("");
					l2[i].setText(rs.getString(2));
					getContentPane().add(l2[i]);
					l2[i].setBounds(235,y,130,120);
					
					
					l3[i] = new JLabel();
					l3[i].setText(rs.getString(3));
					getContentPane().add(l3[i]);
					l3[i].setBounds(455,y,130,120);
									
					l4[i] = new JLabel();
					l4[i].setText(rs.getString(4));
					getContentPane().add(l4[i]);
					l4[i].setBounds(705,y,230,120);
					
					l1[i].setFont(f1);
					l2[i].setFont(f1);
					l3[i].setFont(f1);
					l4[i].setFont(f1);
					
					//i++;
					y=y+20;}
				}
		catch(SQLException sqe)
		{
			JOptionPane.showConfirmDialog(this,sqe.getMessage());
		}	
		
		
	}
        }
        public static void main(String arg[]){
            new salesinfo().setVisible(true);
        }
}

