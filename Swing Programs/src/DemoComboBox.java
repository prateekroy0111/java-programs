import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoComboBox implements ActionListener{
    JLabel l1=new JLabel("selected Item");
    JButton b1=new JButton("Submit");
    JComboBox cb;
    Container c;
    DemoComboBox(){
        JFrame f=new JFrame();
        
        c=f.getContentPane();
        c.setLayout(null);
        
        
        String arr[]={"A","B","C","D","E"};
        cb=new JComboBox(arr);
        cb.setBounds(50, 50, 100, 30);
        cb.setEditable(false);//value can be edited 
        //cb.setSelectedIndex(2);//default selected index
        cb.setSelectedItem("B");//default selected item
        cb.removeItem("D");
        
        l1.setBounds(50, 100, 100, 30);
        b1.setBounds(250, 100, 100, 30);
        b1.addActionListener(this);
        
        c.add(l1);
        c.add(cb);
        c.add(b1);
        
        f.setSize(400,400);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a){
        String item=(String)cb.getSelectedItem();
        l1.setText(item);
        //l1.setText(Integer.toString(cb.getSelectedIndex()));
    }
    public static void main(String[] args) {
        new DemoComboBox();
    }
}
