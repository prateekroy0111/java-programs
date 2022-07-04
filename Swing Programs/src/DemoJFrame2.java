import java.awt.*;
import javax.swing.*;

public class DemoJFrame2{ 
    JLabel l1;
    public DemoJFrame2() {
        JFrame frame=new JFrame();
        
        Container c=frame.getContentPane();
        c.setLayout(null);

        l1=new JLabel("Hello Java");//new JLabel();
        //l1.setText("enter name");
        
        Font obj=new Font("Times New Roman",Font.BOLD,30);
        l1.setFont(obj);
        
        l1.setBounds(300,50,100,30);
        c.add(l1);
        
        ImageIcon img=new ImageIcon("11.jpg");
        JLabel limg=new JLabel(img);
        limg.setBounds(10,10,img.getIconWidth(),img.getIconHeight());
        c.add(limg);
        
        frame.setBounds(200, 200,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new DemoJFrame2();
    }
}