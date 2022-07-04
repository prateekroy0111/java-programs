class PrivateUse2{  
   private int data=40;  
   private void msg(){System.out.println("Hello java");}
   
   public static void main(String args[]){  
      PrivateUse2 obj=new PrivateUse2();  
      System.out.println(obj.data); 
      obj.msg();
   }   
}  
 