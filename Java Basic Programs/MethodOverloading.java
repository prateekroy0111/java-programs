class Adder
{  
   static int greater(int a,int b)
   {
      if(a>b)
         return a;
      else
         return b;
   }  
   static int greater(int a,int b,int c)
   {
      if(a>b && a>c)
         return a;
      else if(b>a && b>c)
         return b;
      else
         return c;
   }  
   public static void main(String[] args)
   {  
      System.out.println(greater(1,2));  
      System.out.println(greater(1,2,3));  
   }
}  
