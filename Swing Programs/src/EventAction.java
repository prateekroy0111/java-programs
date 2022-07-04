import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventAction extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
    
    EventAction(){
        l1=new JLabel("enter 1st number");
        l2=new JLabel("enter 2nd number");
        l3=new JLabel("sum");
        t1=new JTextField(5);
        t2=new JTextField(5);
        b1=new JButton("submit");        
        
        add(l1);
        l1.setBounds(100,100,100,30);
        add(t1);
        t1.setBounds(250,100,100,30);
        add(l2);
        l2.setBounds(100,150,110,30);
        add(t2);
        t2.setBounds(250,150,100,30);
        add(l3);
        l3.setBounds(100,200,100,30);
        add(b1);
        b1.setBounds(250,250,100,30);
        b1.addActionListener(this);
        
        setLayout(null);
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1){
            try{
                int n1,n2;
                n1=Integer.parseInt(t1.getText());
                n2=Integer.parseInt(t2.getText()); 
                l3.setText("result = "+String.valueOf(n1+n2));
            }
            catch(Exception exp){
                System.err.println(exp);
            }
        }
    }
    public static void main(String[] args) {
        new EventAction();
    }
    
}
