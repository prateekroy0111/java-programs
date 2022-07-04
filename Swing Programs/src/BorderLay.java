import java.awt.*;
import javax.swing.*;

public class BorderLay extends JFrame{
    JButton b1,b2,b3,b4,b5;

    BorderLay() {
             
             setLayout(new BorderLayout());//BorderLayout(50,40)
            
        b1=new JButton("submit");
        b2=new JButton("submit");
        b3=new JButton("submit");
        b4=new JButton("submit");
        b5=new JButton("submit");
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
             
        setSize(400, 400);
             setLocation(20, 20);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setVisible(true);
             
    }
    
    public static void main(String[] args) {
     new BorderLay();
    }
}
