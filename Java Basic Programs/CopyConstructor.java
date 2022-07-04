public class CopyConstructor
{
   int roll;
   String name;
   CopyConstructor(int r,String n)
   {
      roll=r;
      name=n;
   }
   CopyConstructor(CopyConstructor cpy)
   {
      roll=cpy.roll;
      name=cpy.name;
   }
   void display()
   {
      System.out.println("roll = "+roll);
      System.out.println("name = "+name);
   }
   public static void main(String[] a)
   {
     CopyConstructor obj1=new CopyConstructor(1,"abc"); 
     obj1.display();
     CopyConstructor obj2=new CopyConstructor(obj1); 
     obj2.display();
   }
}