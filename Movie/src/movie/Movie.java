/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.FlowLayout;
public class Movie extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    public Movie(){
        f = new JFrame("Movie Rental System");
        l1 = new JLabel("Title");
        l2 = new JLabel("Genera");
        l3 = new JLabel("Language");
        l4 = new JLabel("Length");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        b1 = new JButton("add");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        
    
    }
    public void actionPerformed(ActionEvent ae){  
        try{
        
         
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs","root","root");
        System.out.println("database connects successfully");
        Statement stmt=con.createStatement();
           String sql = "insert into movies(title,genera,language,length) values(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, t1.getText());
            pstmt.setString(2, t2.getText());
            pstmt.setString(3, t3.getText());
            pstmt.setString(4, t4.getText());
            
//      
        pstmt.executeUpdate();
        con.close();
            System.out.println("Inserted successfully");                 
        }
         catch(Exception se)
         {
             System.out.println(se);
                     
         }
    }
    
    
public static void main(String[] args) {
 new Movie();
 }

}