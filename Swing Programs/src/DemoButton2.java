import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoButton2{
    JButton b1,b2;
    static Container c;
    DemoButton2(){
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setBounds(20, 100, 500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        c=f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        
        b1=new JButton("RED");
        b1.setBounds(50, 50, 100, 30);
        b1.addActionListener(new ListenerClasss1());
        b2=new JButton("GREEN");
        b2.setBounds(200, 50, 100, 30);
        ListenerClasss2 lc2=new ListenerClasss2();
        b2.addActionListener(lc2);
        
        c.add(b1);
        c.add(b2);
        
    }
    public static void main(String[] args) {
       DemoButton2 obj=new DemoButton2();
    }
}
class ListenerClasss1 implements ActionListener{
    public void actionPerformed(ActionEvent a){
        DemoButton2.c.setBackground(Color.red);
    }
}
class ListenerClasss2 implements ActionListener{
    public void actionPerformed(ActionEvent a){
        DemoButton2.c.setBackground(Color.green);
    }
}