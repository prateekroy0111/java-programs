abstract class Shape{  
   abstract void draw();  
}  
class Rectangle extends Shape{  
   void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
   void draw(){System.out.println("drawing circle");}  
}  
class AbstractUse{  
   public static void main(String args[]){  
      Shape s=new Shape();//In real scenario, object is provided through method e.g. getShape() method  
      s.draw();  
      Shape s1=new Rectangle();//In real scenario, object is provided through method e.g. getShape() method  
      s1.draw(); 
   }  
}