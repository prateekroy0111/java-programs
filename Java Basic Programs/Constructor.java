public class Constructor
{
   Constructor()
   {
      System.out.println("hello");
   }
   Constructor(int n)
   {
      System.out.println(n+n);
   }
   public static void main(String[] a)
   {
     Constructor A1=new Constructor(); 
     Constructor A2=new Constructor(10); 
   }
}