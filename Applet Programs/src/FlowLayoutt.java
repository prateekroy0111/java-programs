import java.awt.*;
 import java.applet.Applet;

 public class FlowLayoutt extends Applet {
     Button button1, button2, button3;
     public void init() {
     setLayout(new FlowLayout());
         button1 = new Button("Ok");
         button2 = new Button("Open");
         button3 = new Button("Close");
         add(button1);
         add(button2);
         add(button3);
     }
 }