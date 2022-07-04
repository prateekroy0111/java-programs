import java.io.*;

class A{
    A(){
    System.out.println("class a");
    }
    int i=20;
    public void sum(){   
        System.out.println("sum = "+i);
    }
}
class B extends A{
    B(){
      super(); //calls parent class costructor
      System.out.println("class b");}
    int i;
    public void sub()
    {
      super.sum();
        i=30;
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
public class Inheritance extends B {
    public static void main(String[] args) {
        Inheritance d=new Inheritance();
        d.sub();
    } 
}