import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Using2Buttons extends JFrame implements ActionListener{
    JLabel l1;
    JTextField t1,t2;
    JButton b1,b2;
    Using2Buttons()
    {
        l1=new JLabel("enter number");
        t1=new JTextField(10);
        t2=new JTextField(10);
        b1=new JButton("add");
        b2=new JButton("sub");
        
        add(l1);
        l1.setBounds(100,100,100,30);
        add(t1);
        t1.setBounds(250,100,100,30);
        add(t2);
        t2.setBounds(250,150,100,30);
        add(b1);
        b1.setBounds(250,200,100,30);
        b1.addActionListener(this);
        add(b2);
        b2.setBounds(250,250,100,30);
        b2.addActionListener(this);
        
        setLayout(null);
        setSize(400, 400);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        int n1,n2,sum;
        String s1,s2,s3;
        if(a.getSource()==b1){
            try{
                s1=t1.getText();
                s2=t2.getText();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                s3=String.valueOf(n2+n1);
                l1.setText("sum = "+s3);
            }
            catch(Exception exp)
            {
                System.out.print(exp);
            }
        }
        if(a.getSource()==b2){
            try{
                s1=t1.getText();
                s2=t2.getText();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                s3=String.valueOf(n1-n2);
                l1.setText("sub = "+s3);
            }
            catch(Exception exp){System.out.print(exp);}

        }
    }
    public static void main(String[] args) {
        new Using2Buttons();
    }
    
}
