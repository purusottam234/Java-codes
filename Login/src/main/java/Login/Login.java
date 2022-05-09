import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
 
public class Login implements KeyListener {
 JFrame frame;
 JPanel panel;
 JButton b1,b2;
 JLabel l1,l2;
 JTextField uf;
 JPasswordField pf;
 Connection con = null;
 Statement stmt = null;
 
 Login()throws ClassNotFoundException, SQLException{
 frame = new JFrame("Login form");
 frame.setLayout(null);
 frame.setSize(400, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/Account","root","root");
 stmt = con.createStatement();
 l1 = new JLabel("User name:");
 l1.setBounds(50, 70, 100, 25);
 l2 = new JLabel("Password:");
 l2.setBounds(50, 100, 100, 25);
 uf = new JTextField();
 uf.setBounds(160, 70, 100, 25);
 pf = new JPasswordField();
 pf.setBounds(160, 100, 100, 25);
 b1 = new JButton("OK");
 b2 = new JButton("Cancel");
 b1.setBounds(50, 140, 100, 25);
 b2.setBounds(160, 140, 100, 25);
 b1.addKeyListener(this);
 frame.add(l1);
 frame.add(uf);
 frame.add(l2);
 frame.add(pf);
 frame.add(b1);
 frame.add(b2);
 frame.setVisible(true);
 }
 
 public void keyPressed(KeyEvent ke){
 if(ke.getKeyChar() == 'l'){
 String uname,password;
 uname = uf.getText();
 password = pf.getText();
 try{
 ResultSet rs = stmt.executeQuery("Select * from account");
 while(rs.next()){
 String s1 = rs.getString(1);
 String s2 = rs.getString(2);
 if(uname.equals(s1) && password.equals(s2)){
 System.out.println("Login success"); 
 }
 else{
 System.out.println("Login failed");
 } 
 }
 }catch(SQLException se){
 System.out.println(se);
 } 
 }
 else if(ke.getKeyChar() == 'c'){
 uf.setText("");
 pf.setText("");
 uf.requestFocus();
 }
 else
 System.out.println("press l for login and c for clear");
 }
 
 public void keyTyped(KeyEvent ke) 
 {}
 public void keyReleased(KeyEvent ke) 
 {}
 public static void main(String[] args) {
 try{
 new Login();
 }catch(Exception e){}
 } }
 
