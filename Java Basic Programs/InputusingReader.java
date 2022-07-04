import java.io.*;

class InputUsingBufferedReader{  
   public static void main(String args[]){  
   
      int a;
      InputStreamReader isr= new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try{
         System.out.println("enter number  ");
         a=Integer.parseInt(br.readLine());
         System.out.println("number = "+a);
      }
      catch(Exception ex){
         System.out.println(ex);
      }
      System.out.print("program ends");

   }  
}  