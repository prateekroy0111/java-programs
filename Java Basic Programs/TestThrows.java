import java.io.*;
class TestThrows1{  
   public static void main(String args[]) throws IOException{
   //throws is used for checked exception(compile time excep.) not for unchecked excep.
   //exception is thrown but need to handle using try catch  
      int a;
      InputStreamReader isr= new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      try
      {
         System.out.println("enter number  ");
         a=Integer.parseInt(br.readLine());
         System.out.println("number = "+a);
      }
      catch(NumberFormatException e){System.out.println(e);}
      System.out.println("\nprogram ends");
   }  
}