import java.io.*;
import java.util.Scanner;

public class Password
{
   public static void main(String[] args)
   {
      String s1,s2="password";
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter password");
      s1=sc.next();
      
      if(s1.equals(s2))
      {
         int i=1;
         while(i<=10)
         {
            System.out.println(1*i+"\t"+2*i+"\t"+3*i+"\t"+4*i+"\t"+5*i+"\t"+6*i+"\t"+7*i+"\t"+8*i+"\t"+9*i+"\t"+10*i);
            i++;
         }
      }
      else
      {
         System.out.println("\nwrong password");
      }
   }
} 
      
      