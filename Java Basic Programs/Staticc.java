class Staticc
{
   int id;
   int roll;
   static String institute;
   
   static //static block to inititalize static variable 
   //it runs first when a program is executed
   {
      System.out.println("This is static block");
      institute="GENCOR";
   }

   public static void main(String args[])
   {
      Staticc ob1=new Staticc();
      Staticc ob2=new Staticc();
      
      ob1.id=1;
      ob1.roll=10;
      System.out.println("id= "+ob1.id);
      System.out.println("roll= "+ob1.roll);
      System.out.println("institute= "+institute);//no need of object to call static variable
      
      
      ob2.id=2;
      ob2.roll=11;
      System.out.println("id= "+ob2.id);
      System.out.println("roll= "+ob2.roll);
      System.out.println("institute= "+institute);
   }
}