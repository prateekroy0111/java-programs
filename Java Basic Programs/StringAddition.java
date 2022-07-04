import java.util.Scanner;

class StringAddition
{
   public static void main(String[] args)
   {
      String i,j,s;
      int k;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter num 1 in String1  ");
      i=sc.next();   //takes input as string
      System.out.print("enter num 2 in String2  ");
      j=sc.next();   //takes input as string
       //converts int to string
      System.out.println(i+j);
   }
}