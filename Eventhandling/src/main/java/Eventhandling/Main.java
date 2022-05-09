import javax.swing.*;
import java.awt.event.*;

class EventDemo extends JFrame implements ActionListener{
    JLabel lb;
    EventDemo(){
        lb = new JLabel();
        lb.setBounds(60,50,170,20);
        setLayout(null);
        JButton b1 = new JButton("continue");
        b1.setBounds(50,120,80,30);
        JButton b2 = new JButton("OK");
        b2.setBounds(140,120,80,30);
        add(lb);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setActionCommand("proceed");
        b2.setActionCommand("proceed");
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="proceed")
            lb.setText("Do you want to proceed???");
        
    }
    public static void main(String args[])
    {
        new EventDemo();
    }
}