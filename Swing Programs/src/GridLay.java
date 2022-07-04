import java.awt.*;
import javax.swing.*;

public class GridLay extends JFrame{
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4;

    GridLay(){
        l1= new JLabel("Hello");
        l2= new JLabel("Hello");
        l3= new JLabel("Hello");
        l4= new JLabel("Hello");
        b1= new JButton("submit1");
        b2= new JButton("submit2");
        b3= new JButton("submit3");
        b4= new JButton("submit4");
        
        //GridLayout gl = new GridLayout(2,2);
        //setLayout(gl);
        setLayout(new GridLayout(4,2));//GridLayout(2,4,30,40);
        add(l1);
        add(b1);
        add(l2);
        add(b2);
        add(l3);
        add(b3);
        add(l4);
        add(b4);
        
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new GridLay();
    }
}
