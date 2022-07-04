class Bike
{  
   final int speedlimit=90;//final variable  
   void run()
   { 
      //speedlimit=400;  
      System.out.println(speedlimit);
   } 
}
class Final
{ 
   public static void main(String args[])
   {  
      Bike obj=new  Bike();  
      obj.run();  
   }  
}//end of class  
