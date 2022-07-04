import java.applet.Applet;
import java.awt.*;

public class FontExample extends Applet {

    Color cobj=new Color(25,53,15);//RGB between 0 to 255
    Color cobj2=new Color(255,0,0);
    Font  obj=new Font("Times New Roman",Font.BOLD,20);
    Font  obj1=new Font("Arial",Font.ITALIC,30);
   
    public void paint(Graphics g){
        g.setColor(cobj);//Color.red
        g.setFont(obj);
        g.drawString("hello", 50, 20);
        g.drawString("1233453534", 20, 50);
        g.setColor(cobj2);
        g.setFont(obj1);
        g.drawString("hello world", 50, 100);
    }
}