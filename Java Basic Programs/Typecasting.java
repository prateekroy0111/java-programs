public class Typecasting
{
   public static void main(String[] a )
   {  
      int num;
      String sum;
      System.out.println("my first string is "+a[0]);
      System.out.println("my second string is "+a[1]);
      num=Integer.parseInt(a[0])+Integer.parseInt(a[1]);
      sum=String.valueOf(num);
      System.out.println("sum = "+sum);
   }
}