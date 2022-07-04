class Staticc2{
   static int roll;
   public static void main(String args[]){
      Staticc2 ob1=new Staticc2();
      ob1.roll=10;
      Staticc2 ob2=new Staticc2();
      ob2.roll=20;
      System.out.println("roll using ob1 = "+ob1.roll);  //value fixed by last object
      System.out.println("roll using ob2 = "+ob2.roll);
   }
}