class T22 extends Thread{//child thread waiting for main thread
   static Thread mt;
   public void run(){
      int i;
      try{
         mt.join(5000);//mt.join();
      }
      catch(InterruptedException e){}
      
      for(i=1;i<6;i++){
         System.out.println("Child thread");
      }
   }
}
class ThreadJoin2{
   public static void main(String args[]) throws InterruptedException{
      T22.mt=Thread.currentThread();
      T22 obj=new T22();
      obj.start();
      for(int i=1;i<6;i++){
         System.out.println("Main thread");
         Thread.sleep(3000);
      } 
   }
}