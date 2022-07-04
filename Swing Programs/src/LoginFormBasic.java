import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFormBasic implements ActionListener{
    Container c;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    JLabel err=new JLabel("enter correct details");
    LoginFormBasic(){
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=f.getContentPane();
        c.setLayout(null);
        
        l1=new JLabel("enter username");
        l2=new JLabel("enter password");
        t1=new JTextField(20);
        t2=new JPasswordField(20);
        b1=new JButton("login");
        
        
        l1.setBounds(50,100,100,30);
        t1.setBounds(150,100,100,30);
        l2.setBounds(50,150,110,30);
        t2.setBounds(150,150,100,30);
        b1.setBounds(200,200,100,30);
        b1.addActionListener(this);
        
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(b1);
    }
    
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1)
        {
            String username=t1.getText();
            String password=t2.getText();
            if(username.equals("user")&&password.equals("password"))
            {
                c.setBackground(Color.green);
                c.remove(err);
            }
            else
            {
                c.setBackground(Color.red);
                err.setBounds(10,200,150,30);
                c.add(err);
            }
        }
    }
    
    public static void main(String[] agrs){
        new LoginFormBasic();
    }
}
