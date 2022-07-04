abstract class Demo1{
   void show()
   {
      System.out.println("This is show fn");
   }
   abstract void show1();
   abstract void show2();
}
public class Abstractt1 extends Demo1
{
   void show1()
   {
      System.out.println("This is show1 fn");
   }
   void show2()
   {
      System.out.println("This is show2 fn");
   }
   
   public static void main(String args[])
   {
      Abstractt1 ob1=new Abstractt1();
      ob1.show();
      ob1.show1();
      ob1.show2();
   }
}