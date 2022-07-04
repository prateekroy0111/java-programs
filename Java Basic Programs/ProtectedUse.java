class A{  
   protected int data=40;  
   protected void msg(){System.out.println("Hello java");}  
}  
class B extends A{
   void print1()
   {
      System.out.println(data); 
   }
   void print2()
   {
       msg();
   }
}
public class ProtectedUse{  
   public static void main(String args[]){  
      A obj=new A();  
      System.out.println(obj.data); 
      obj.msg();
      
      B obj2=new B();
      obj2.print1();
      obj2.print2();
   }  
}  
