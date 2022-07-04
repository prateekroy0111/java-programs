import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoTextFieldListner  implements ActionListener{
    Container c;
    JLabel lb;
    JTextField tf;
    DemoTextFieldListner(){
        JFrame f=new JFrame();
        f.setSize(400,300);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=f.getContentPane();
        c.setLayout(null);
        
        lb=new JLabel("ENTER NAME");
        lb.setBounds(50, 50, 100, 30);
        tf=new JTextField(20);
        tf.setBounds(200, 50, 100, 30);
        tf.addActionListener(this);
        
        c.add(lb);
        c.add(tf);
    }
    public void actionPerformed(ActionEvent a)
    {
        String text=tf.getText();
        String newText=text.toUpperCase();
        tf.setText(newText);
    }
    public static void main(String[] args) {
        new DemoTextFieldListner();
    }
}
