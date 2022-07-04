class Th extends Thread{
   public void run(){
      System.out.println(Thread.currentThread());
   }
}

class Th1 extends Thread{
   public void run(){
      System.out.println(Thread.currentThread());
   }
}

class ThreadCurrentt{
   public static void main(String args[]){
      Th obj=new Th();
      obj.start();
      
      Th1 obj1=new Th1();
      obj1.start();
      
      System.out.println(Thread.currentThread());
   }
}
//thread name, thread priority, thread group