import java.awt.*;
import javax.swing.*;

public class DemoJFrame extends JFrame{ 
    
    DemoJFrame(){
        Container c=getContentPane();
        c.setBackground(Color.red);
        //Color cobj=new Color(255,0,0);//RGB between 0 to 255//
        //c.setBackground(cobj);
        
        c.setLayout(null);
        JLabel l=new JLabel("hello");
        l.setBounds(20,20,100,30);
        c.add(l);
        

        ImageIcon icon=new ImageIcon("121.jpg");
        
        
        setResizable(false);
        setTitle("MY FRAME");
        setIconImage(icon.getImage());
        setLocation(200, 200);
        setSize(400,400);
        //setBounds(200, 200,400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
    public static void main(String[] args){
        DemoJFrame d=new DemoJFrame();//new DemoJFrame();
    }
}