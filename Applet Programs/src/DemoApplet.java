import java.applet.Applet;
import java.awt.Graphics;

public class DemoApplet extends Applet {
    public void init()
    {
        System.out.println("init is called");
    }
    public void start()
    {
        System.out.println("start is called");
    }
    public void paint(Graphics g)
    {
        g.drawString("hello world",30,20);
        System.out.println("paint is called");
    }
    public void stop()
    {
        System.out.println("stop is called");
    }
    public void destroy()
    {
        System.out.println("destroy is called");
    }
}
//<applet code="DemoApplet.class" name="myapplet" height="300" width="300" ></applet>