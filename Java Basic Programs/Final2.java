class Bike
{  
   final void run(){System.out.println("running");}  
}

class Bike2 extends Bike
{ 
   void run(){System.out.println("running safely with 100kmph");}  
}
class Final2
{ 
   public static void main(String args[])
   {  
      Bike2 obj=new  Bike2();  
      obj.run();  
   }  
}//end of class  
