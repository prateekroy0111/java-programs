import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame implements ActionListener
{
   JLabel l1,l2,l3;
   JTextField t1,t2;
   JButton b1;
   Container c;
   Window()
   {
      l1=new JLabel("Enter 1st num");
      t1=new JTextField();
      l2=new JLabel("Enter 2nd num");
      t2=new JTextField();
      l3=new JLabel("sum");
      b1=new JButton("submit");
      
      c=getContentPane();
      c.setLayout(new GridLayout(3,2));
      c.add(l1);
      c.add(t1);
      c.add(l2);
      c.add(t2);
      c.add(l3);
      c.add(b1);
      b1.addActionListener(this);

      setSize(300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }
   public void actionPerformed(ActionEvent a)
   {
      if(a.getSource()==b1)
      {
        try{
            String n1=t1.getText();
            String n2=t2.getText();
            int num1=Integer.parseInt(n1);
            int num2=Integer.parseInt(n2);
            l3.setText("sum = "+(num1+num2));
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
      }
   }
   public static void main(String agrs[])
   {
      Window w=new Window();
   }
}