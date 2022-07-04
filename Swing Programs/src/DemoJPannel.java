import java.awt.*;
import javax.swing.*;

public class DemoJPannel{
    
    DemoJPannel(){
        JFrame f=new JFrame();
        f.setSize(400,300);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        c.setLayout(null);
        
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.red);
        panel1.setBounds(0, 0, 200, 200);
        
        JPanel panel2=new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setBounds(0, 0, 100, 150);
        
        c.add(panel1);
        panel1.add(panel2);
        
        
    }
    public static void main(String[] args) {
        new DemoJPannel();
    }
}
