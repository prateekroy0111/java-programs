class T11 extends Thread{//main thread waiting for child thread
   public void run(){
      int i;
      for(i=1;i<6;i++){
         System.out.println("Child thread");
         try{
            Thread.sleep(5000);//sleeps for 5000ms then executes
         }
         catch(InterruptedException e){}
      }
   }
}
class ThreadJoin{
   public static void main(String args[]) throws InterruptedException{
   //hadle exception while using join method
      T11 obj=new T11();
      obj.start();
      obj.join(9000);//join is written in the thread which is waiting 
      //main thread will wait till child thred execution is complete
      for(int i=1;i<6;i++){
         System.out.println("Main thread");
      } 
   }
}