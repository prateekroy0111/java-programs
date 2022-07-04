class Th1 extends Thread{
   public void run(){
      System.out.println(Thread.currentThread().getName());
   }
}
class ThreadNamee{
   public static void main(String args[]){
      Th1 obj=new Th1();
      obj.start();
      //System.out.println(obj.getName());
      System.out.println(Thread.currentThread().getName());

   }
}
