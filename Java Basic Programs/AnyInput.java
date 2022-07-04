import java.util.Scanner;

public class AnyInput
{
   public static void main(String args[])
   {
      int i;
      float f;
      double d;
      String s;
      String word;
      char c;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter a sentence");
      s=sc.nextLine();
      
      System.out.println("Enter word");
      word=sc.next();
            
      System.out.println("Enter no");
      i=sc.nextInt();
      
      System.out.println("Enter double");
      d=sc.nextDouble();
      
      System.out.println("Enter float");
      f=sc.nextFloat();
      
      System.out.println("Enter character");
      c=sc.next().charAt(0);
      
      System.out.println(" no. is "+i+" word is "+word+" string is "+s+" float is "+f+" double is "+d+" character is "+c);;
      
   }
}