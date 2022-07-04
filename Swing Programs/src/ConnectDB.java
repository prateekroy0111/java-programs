package projectroy;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.sql.*;

public class ConnectDB extends Applet implements ActionListener
        {
    Button b1;
    Label l1,l2,l3;
    TextField t1,t2;
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    
    GridBagLayout gb=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    void addcomp(int row,int col,int height,int width,Component com)
    {
        gbc.gridheight=height;
        gbc.gridwidth=width;
        gbc.gridx=col;
        gbc.gridy=row;
        gb.setConstraints(com, gbc);
            add(com);
            
                
            }
            public void init()
            {
                b1=new Button("Login");
                l1=new Label("Name");
                l2=new Label("Password");
                l3=new Label("Status");
                t1=new TextField(20);
                t2=new TextField(20);
                t2.setEchoChar('*');
                setLayout(gb);
            addcomp(1,1,1,1,l1);
            addcomp(1,2,1,1,t1);
            addcomp(2,1,1,1,l2);
            addcomp(2,2,1,1,t2);
            addcomp(3,1,1,1,b1);
            addcomp(4,2,1,1,l3);
            b1.addActionListener(this);                       
}
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b1)
                {
                   String s=t1.getText();
                   String s2=t2.getText();
                   String u,p;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Root");//3333 port,db username,db pass
                        System.out.print("Connected");//when database is connected
                        pstmt=con.prepareStatement("select name,pass from login");//query
                        rs=pstmt.executeQuery();//execute query
                        while(rs.next())//next row loop
                        {
                        u=rs.getString(1);
                        p=rs.getString(2);
                         if(s.equals(u) && s2.equals(p)){
                         l3.setText("welcome");
                         }
                         else{
                         l3.setText("TryAgain");
                         }
                        }                       
                    } 
                    catch (Exception ep){
                        System.out.print("Not Connected");
                    }
                }
            }

}