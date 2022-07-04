import javax.swing.*;
import java.awt.*;

public class DemoJFrame3 {
    DemoJFrame3(){
        JFrame fr=new JFrame();
        
        
        Container c=fr.getContentPane();
        c.setLayout(null);
        
        Font fobj=new Font("Times New Roman",Font.BOLD,30);
        
        ImageIcon img=new ImageIcon("11.jpg");
        
        JLabel l=new JLabel("text",img,JLabel.LEFT);//JLabel.RIGHT/LEFT/CENTER
        l.setBounds(20, 50, 100, 30);
        
        JTextField t=new JTextField("enter text");
        t.setBounds(20, 90, 200, 30);
        t.setBackground(Color.RED);
        t.setForeground(Color.YELLOW);
        t.setFont(fobj);
        
        JPasswordField p=new JPasswordField();
        p.setBounds(70, 150, 100, 30);
        
        c.add(l);
        c.add(t);
        c.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setBounds(200, 100, 400, 400);
    }
    
    public static void main(String[] args) {
        new DemoJFrame3();
    }
}
