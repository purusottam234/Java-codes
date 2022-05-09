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
        
         String title = t1.getText();
         String genera = t2.getText();
         String language = t3.getText();
         String length = t4.getText();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/movies","root","");
        System.out.println("database connects successfully");
        Statement stmt=con.createStatement();
        String sql= "INSERT INTO movie"+"VALUES('"+title+"','"+genera+"','"+language+"','"+length+"')";
        ResultSet rs=stmt.executeQuery(sql);
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