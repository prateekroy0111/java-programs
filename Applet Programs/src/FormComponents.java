import java.applet.Applet;
import java.awt.*;

public class FormComponents extends Applet {
    Label l1=new Label("enter your name");
    TextField t1=new TextField(50);//("hello hello",20)
    TextArea ta1=new TextArea("addres", 5, 15);
    Checkbox c1=new Checkbox("java", true);
    Checkbox c2=new Checkbox("C");
    Button b1=new Button("submit");//Button b1;
    
    public void init() {
        add(l1);
        add(t1);
        t1.setText("hello hello");
        t1.setEditable(false);
        add(ta1);
        add(c1);
        add(c2);//c2.setState(true);
        add(b1);//b1=new Button("Submit");
    }
}
//<applet code="FormComponents.class" height="200" width="150"></applet>