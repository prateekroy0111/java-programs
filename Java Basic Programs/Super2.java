class Animal
{  
   void eat(){System.out.println("animal class");}  
}  

class Dog extends Animal
{  
   void eat(){System.out.println("dog class");} 

   void print(){super.eat();}    
}
  
class Super2
{  
   public static void main(String args[])
   {  
      Dog d=new Dog(); 
      d.eat(); 
      d.print();  
   }
}  
