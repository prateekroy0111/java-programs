import java.applet.Applet;
import java.awt.*;

public class FormList extends Applet {
    List course=new List();//List(3,true);
    public void init() {
        course.add("html");
        course.add("Java");
        course.add("c++");
        course.add("c");
        course.add("php");
        add(course);
        //course.select(2);
        course.setMultipleMode(true);
    }
}
