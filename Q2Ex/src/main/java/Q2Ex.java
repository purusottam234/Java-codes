import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Q2Ex {
 JFrame f;
 JLabel l1,l2;
 JTextField t1;
 JPasswordField p1;
 JButton b1,b2;
 public Q2Ex() {
 f= new JFrame("login Example");
 l1=new JLabel("Username");
 l2= new JLabel("Password");
 t1= new JTextField(25);
 p1= new JPasswordField(25);
 b1= new JButton("OK");
 b2= new JButton("Cancel");
 f.add(l1);
 f.add(t1);
 f.add(l2);
 f.add(p1);
 f.add(b1);
 f.add(b2);
 f.setSize(300,300);
 f.setVisible(true);
 f.setLayout(new FlowLayout());
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 b1.addKeyListener(new KeyAdapter(){
 public void keyPressed(KeyEvent e){
 try{
 String uname=t1.getText();
 String upass=new String(p1.getText());
 Class.forName("com.mysql.jdbc.Driver");
 Connection con= 
DriverManager.getConnection("jdbc:mysql://localhost/account","root","");
 System.out.println("database connects successfully");
 Statement stmt=con.createStatement();
 String sql= "select * from user";
 ResultSet rs=stmt.executeQuery(sql);
 
 if(e.getKeyChar()=='1'){
 while(rs.next()){ 
 if(rs.getString(1).equals(uname)&& rs.getString(2).equals(upass))
 JOptionPane.showMessageDialog(f, "Log in successfully");
 }
 }
 }catch(Exception ex) {System.out.println(ex.getMessage());} 
 if(e.getKeyChar()=='c')
 {
 t1.setText("");
 p1.setText("");
 t1.requestFocus();
 } 
 } });
 }
 
 
 public static void main(String[] args) {
 new Q2Ex();
 }
}