import java.awt.*;
import javax.swing.*;

public class CardLay extends JFrame{
    JPanel p1,p2,p3;
    JButton b1,b2,b3,b4;

    CardLay(){
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        b1= new JButton("submit1");
        b2= new JButton("submit2");
        b3= new JButton("submit3");
        b4= new JButton("submit4");
        
        CardLayout cl=new CardLayout();
        p1.setLayout(cl);
        p2.add(b1);
        p2.add(b2);
        p3.add(b3);
        p3.add(b4);
        p1.add(p2,"Ram");
        p1.add(p3,"Ram2");
        add(p1);
        cl.show(p1,"Ram2");
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new CardLay();
    }
}
