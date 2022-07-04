class Animal
{  
   Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal
{  
   Dog()
   {  
      super(); //super must be first statement in constructor 
      System.out.println("dog is created");  
      
   }  
}  
class Super3
{  
   public static void main(String args[])
   {  
      Dog d=new Dog();  
   }
}