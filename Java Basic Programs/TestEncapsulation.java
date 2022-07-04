// Java program to demonstrate encapsulation
class Encapsulate
{
    // private variables declared these can only be accessed by public methods of class
    private String name;
    private int roll;
    private int age;
 
    // get method for age to access private variable age
    public int getAge() 
    {
      return age;
    }
  
    // get method for name to access private variable name
    public String getName() 
    {
      return name;
    }
     
    // get method for roll to access private variable roll
    public int getRoll() 
    {
       return roll;
    }
  
    // set method for age to access private variable age
    public void setAge(int newAge)
    {
      age = newAge;
    }
  
    // set method for name to access private variable name
    public void setName(String newName)
    {
      name = newName;
    }
     
    // set method for roll to access private variable roll
    public void setRoll( int newRoll) 
    {
      roll = newRoll;
    }
}

class TestEncapsulation
{    
    public static void main (String[] args) 
    {
        Encapsulate obj = new Encapsulate();
         
        // setting values of the variables 
        obj.setName("Harsh");
        obj.setAge(155);
        obj.setRoll(51);
         
        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());
         
        // Direct access of roll is not possible due to encapsulation
        // System.out.println("Student's roll: " + obj.roll);        
    }
}