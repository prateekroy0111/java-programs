import java.awt.*;
import javax.swing.*;

public class NullLAy extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;

    NullLAy(){
        l1= new JLabel("enter name");
        l2= new JLabel("enter class");
        t1= new JTextField(10);
        t2= new JTextField(10);
        b1= new JButton("submit");
        
        setLayout(null);
        l1.setBounds(10,10, 100, 30);
        add(l1);
        
        add(t1);
        t1.setBounds(115,10, 100, 30);
        add(l2);
        l2.setBounds(10,70, 100, 30);
        add(t2);
        t2.setBounds(115,70, 100, 30);
        add(b1);
        b1.setBounds(10,120, 100, 30);
        
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new NullLAy();
    }
}
