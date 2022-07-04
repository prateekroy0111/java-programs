import java.awt.*;
import javax.swing.*;

public class DemoRadioButton {
    DemoRadioButton(){
        JFrame f=new JFrame();
        
        Container c=f.getContentPane();
        c.setLayout(null);
        
        JRadioButton r1=new JRadioButton("male", true);
        r1.setBounds(50, 50, 100, 30);
        //r1.setSelected(true);//selected by default 
        JRadioButton r2=new JRadioButton("female");
        r2.setBounds(150, 50, 100, 30);
        //r2.setEnabled(false);//cant select this button
        
        ButtonGroup gender=new ButtonGroup();//selects only one option from the radio buttons
        gender.add(r1);
        gender.add(r2);
        
        Font font=new Font("Arial", Font.BOLD, 18);
        r1.setFont(font);
        r2.setFont(font);
        
        c.add(r1);
        c.add(r2);
        
        f.setSize(400,400);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new DemoRadioButton();
    }
}
