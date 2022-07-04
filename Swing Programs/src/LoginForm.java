import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
        
    LoginForm(){
        l1=new JLabel("enter user id");
        l2=new JLabel("enter password");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("login");
        
        add(l1);
        l1.setBounds(100,100,100,30);
        add(t1);
        t1.setBounds(250,100,100,30);
        add(l2);
        l2.setBounds(100,150,110,30);
        add(t2);
        t2.setBounds(250,150,100,30);
        add(b1);
        b1.setBounds(250,250,100,30);
        b1.addActionListener(this);
        
        setLayout(null);
        setSize(400,400);
        setLocation(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1)
        {
           String s=t1.getText();
           String s2=t2.getText();
           String user,pass;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3333/student","root","root");
                System.out.print("Connected");
                pstmt=con.prepareStatement("select user,pass from login");
                rs=pstmt.executeQuery();
                while(rs.next())
                {
                user=rs.getString(1);
                pass=rs.getString(2);
                 if(s.equals(user) && s2.equals(pass)){
                     System.out.println("hello");
                 }
                 else{
                    System.out.println("try again");
                 }
                }                       
            } 
            catch (Exception e){
                System.out.print("Not Connected");
            }
        }
    }
    
    public static void main(String[] agrs){
        new LoginForm();
    }
}
