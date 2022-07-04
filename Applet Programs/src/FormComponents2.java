import java.applet.Applet;
import java.awt.*;

public class FormComponents2 extends Applet {
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox c1=new Checkbox("html", cbg, true);
    Checkbox c2=new Checkbox("Java", cbg,false);
    Checkbox c3=new Checkbox("C", cbg,false);
    Checkbox c4=new Checkbox("c++", cbg, true); 
    
    Choice course=new Choice();
    
    public void init() {
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        
        
        course.addItem("html");
        course.addItem("Java");
        course.addItem("c++");
        add(course);
        //course.select("Java");
        course.select(1);
    }
}