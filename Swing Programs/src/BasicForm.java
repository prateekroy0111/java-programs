import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasicForm implements ActionListener{
    Container c;
    JLabel name_lb,mob_lb,dob_lb,gender_lb,add_lb;
    JTextField name_tf,mob_tf;
    JComboBox datee_cb,month_cb,year_cb;
    JRadioButton male,female;
    JTextArea add_ta,result_ta;
    JCheckBox cb;
    JButton btn;
    BasicForm(){
        JFrame f=new JFrame();
        
        
        c=f.getContentPane();
        c.setLayout(null);
        
        name_lb=new JLabel("NAME");
        name_lb.setBounds(50, 50, 100, 30);
        name_tf=new JTextField(20);
        name_tf.setBounds(200, 50, 100, 30);
        
        mob_lb=new JLabel("MOBILE");
        mob_lb.setBounds(50, 100, 100, 30);
        mob_tf=new JTextField(20);
        mob_tf.setBounds(200, 100, 100, 30);
        
        dob_lb=new JLabel("DOB");
        dob_lb.setBounds(50, 150, 100, 30);
        
        String[] datee=new String[31];
        for(int i=1;i<=31;i++)
            datee[i-1]=Integer.toString(i);
        datee_cb=new JComboBox(datee);
        datee_cb.setBounds(200, 150, 40, 30);
        
        String[] month={"jan","feb","mar","apr","may","jun","jul","aug","sep",
            "oct","nov","dec"};
        month_cb=new JComboBox(month);
        month_cb.setBounds(250, 150, 60, 30);
    
        String[] year=new String[16];
        for(int i=1990;i<=2005;i++)
            year[i-1990]=Integer.toString(i);
        year_cb=new JComboBox(year);
        year_cb.setBounds(320, 150, 60, 30);
        
        gender_lb=new JLabel("GENDER");
        gender_lb.setBounds(50, 200, 100, 30);
        
        male=new JRadioButton("male", true);
        male.setBounds(200, 200, 100, 30);
        female=new JRadioButton("female");
        female.setBounds(300, 200, 100, 30);
        
        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
        
        add_lb=new JLabel("ADDRESS");
        add_lb.setBounds(50, 250, 100, 30);
        add_ta=new JTextArea();
        add_ta.setBounds(200, 250, 220, 70);
        
        cb=new JCheckBox("Check to continue");
        cb.setBounds(50, 330, 150, 30);
        
        btn=new JButton("Submit");
        btn.setBounds(50, 380, 100, 30);
        btn.addActionListener(this);
        
        result_ta=new JTextArea();
        result_ta.setBounds(450, 50, 150, 200);
        
        c.add(name_lb);
        c.add(name_tf);
        c.add(mob_lb);
        c.add(mob_tf);
        c.add(dob_lb);
        c.add(datee_cb);
        c.add(month_cb);
        c.add(year_cb);
        c.add(gender_lb);
        c.add(male);
        c.add(female);
        c.add(add_lb);
        c.add(add_ta);
        c.add(cb);
        c.add(btn);
        c.add(result_ta);
        
        f.setSize(700,500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a){
        if(cb.isSelected()==true){
            String nm=name_tf.getText();
            String mob=mob_tf.getText();
            String date=(String)datee_cb.getSelectedItem();
            String mon=(String)month_cb.getSelectedItem();
            String yr=(String)year_cb.getSelectedItem();
            String gen="male";
            if(female.isSelected())
                gen="female";
            String addr=add_ta.getText();
            result_ta.setText("Name = "+nm+"\nMobile= "+mob+"\ndate = "+date+
                    "  "+mon+"  "+yr+"\nGender= "+gen+"\nAddress= "+addr);
        }
        else{
            result_ta.setText("please check the check box");
        }
    }
    public static void main(String[] args) {
        new BasicForm();
    }
}
