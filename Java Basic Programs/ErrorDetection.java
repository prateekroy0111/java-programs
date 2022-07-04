import java.io.*;
import java.util.Scanner;

public class ErrorDetection
{
   public static void main(String[] s)
   {
      int a;
      Scanner sc=new Scanner(System.in);
      
      try
      {
         System.out.print("Enter no.");
         a=sc.nextInt();
         System.out.print("Your Entered Number is "+a);
      }
      catch(Exception ex)
      {
         System.out.println("please enter number only");//error for user
         ex.printStackTrace();//error for programmer 
      } 
   }
   
}