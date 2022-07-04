import javax.swing.*;
import java.awt.*;

public class FlwLay extends JFrame
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    FlwLay()
    {
        l1=new JLabel("name ");
        l2=new JLabel("contact");
        t1=new JTextField(10);
        t2=new JTextField(10);
        b1=new JButton("submit");
        
        setLayout(new FlowLayout(FlowLayout.RIGHT,50,40));
        //FlowLayout(FlowLayout.LEFT/RIGHT/CENTER, 50,40)
        add(l1);
        add(l2);
        add(b1);
        add(t2);
        add(t1);
        
         setSize(200, 400);
         setLocation(500, 20);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    
    }
    public static void main(String[] args) {
     FlwLay obj=new FlwLay();
    }
}
