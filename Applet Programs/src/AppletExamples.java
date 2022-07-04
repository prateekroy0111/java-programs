import java.applet.Applet;
import java.awt.*;

public class AppletExamples extends Applet {

    Label l1;
    TextField t1=new TextField(10);//("hello hello",20);
    TextArea ta1=new TextArea(4, 10);
    public void init() {
        l1=new Label("enter your name");
        add(l1);
        add(t1);
        t1.setText("hello hello");
        add(ta1);
        ta1.setText("h");
    }
}