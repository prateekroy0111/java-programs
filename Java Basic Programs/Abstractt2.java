abstract class Abstract11
{
   abstract void show();
}
class Abstractt2 extends Abstract11{
   void show()
   {
   }
   
   void show2()
   {
      System.out.println("this is show2");
   }

   public static void main(String args[])
   {
      System.out.println("this is main");
      Abstractt2 ab=new Abstractt2();
      ab.show2();
   }
}