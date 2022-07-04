import java.awt.*;
import javax.swing.*;

public class GridBagLay extends JFrame {

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    
    GridBagLayout gb=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    void addcomp(int x,int y,int width,int height,Component com)
    {
       gbc.gridx=x;
       gbc.gridy=y;
       gbc.gridwidth=width;
       gbc.gridheight=height;
       gb.setConstraints(com, gbc);
       add(com);   
    }
    
    GridBagLay(){
        l1= new JLabel("enter name");
        l2= new JLabel("enter class");
        t1= new JTextField(10);
        t2= new JTextField(5);
        b1= new JButton("submit");
        b2= new JButton("submit");
        
        setLayout(gb);
        
        addcomp(1,1,1,1,l1);
        addcomp(2,1,1,1,t1);
        addcomp(3,1,1,1,b1);
        addcomp(1,2,1,1,l2);
        addcomp(2,2,1,1,t2);
        addcomp(3,2,1,1,b2);
        
        
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
    public static void main(String[] args) {
        new GridBagLay();
    }
}
