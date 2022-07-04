public class Allstringfn{
public static void main(String args[]){
      String s="hello";
      String s1="Computers";
      System.out.println("length = "+s.length());
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
      System.out.println(s.charAt(3));
      System.out.println(s.compareTo(s1));
      System.out.println(s.concat(s1));
      System.out.println(s+s1);
      boolean ew=s.startsWith("R");
      System.out.println(ew);
      boolean ew1=s.endsWith("o");
      System.out.println(ew1);
      if(s.equals(s1))
      {
         System.out.println("value matched");
      }
      else
      {
         System.out.println("value not matched");
      }
      if(s1.contains("c"))
      {
         System.out.println("yes "+s1+" contains");
      }
      else
      {
         System.out.println("no "+s1+" doesnt contains");
      }
   }
}