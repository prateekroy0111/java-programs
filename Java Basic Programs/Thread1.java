class T1 extends Thread{
   public void run(){
      int i;
      for(i=1;i<6;i++){
         System.out.println("Child thread");
      }
   }
}
class Thread1{
   public static void main(String args[]){
      T1 obj=new T1();
      obj.start();
      //run() for normal execution of program start() for multithread
      
      for(int i=1;i<6;i++){
         System.out.println("Main thread");
      } 
   }
}