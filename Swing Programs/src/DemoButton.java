import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoButton implements ActionListener{
    JButton b1,b2,b3;
    Container c;
    DemoButton(){
        JFrame f=new JFrame();
        
        c=f.getContentPane();
        c.setLayout(null);
        
        b1=new JButton("RED");
        b1.setBounds(50, 50, 100, 30);
        b1.addActionListener(this);
        b2=new JButton("GREEN");
        b2.setBounds(200, 50, 100, 30);
        b2.addActionListener(this);
        b3=new JButton("BLUE");
        b3.setBounds(350, 50, 100, 30);
        b3.addActionListener(this);
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        
        f.setVisible(true);
        f.setBounds(20, 100, 500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1){
            c.setBackground(Color.red);
        }
        if(a.getSource()==b2){
            c.setBackground(Color.green);
        }
        if(a.getSource()==b3){
            c.setBackground(Color.blue);
        }
    }
    public static void main(String[] args) {
        new DemoButton();
    }
}
