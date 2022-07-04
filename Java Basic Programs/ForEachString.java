import java.io.*;
import java.util.Scanner;

public class ForEachString
{
   public static void main(String[] args)
   {
      int j;
      String a[]=new String[5];
      Scanner sc=new Scanner(System.in);
      
      for(j=0;j<5;j++)
      {
         System.out.println("Enter String\t");
         a[j]=sc.next();
      }
      
      for(String s:a)
      {
         System.out.println(s);
      }
   }
}