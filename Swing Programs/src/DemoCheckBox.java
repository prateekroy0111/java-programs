import java.awt.*;
import javax.swing.*;

public class DemoCheckBox {
    DemoCheckBox(){
        JFrame f=new JFrame();
        
        
        Container c=f.getContentPane();
        c.setLayout(null);
        
        JCheckBox c1=new JCheckBox("C");
        c1.setBounds(50, 50, 100, 30);
        //c1.setSelected(true);
        
        JCheckBox c2=new JCheckBox("C++",true);
        c2.setBounds(150, 50, 100, 30);
        
        Font font=new Font("Arial", Font.BOLD, 18);
        c1.setFont(font);
        c2.setFont(font);
        
        c.add(c1);
        c.add(c2);
        
        f.setSize(400,400);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new DemoCheckBox();
    }
}
