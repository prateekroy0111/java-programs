class Thr2 extends Thread{
   public void run(){
   }
}
class ThreadPriority{
   public static void main(String args[]){
   
      System.out.println("old priority (main) "+Thread.currentThread().getPriority());
      Thread.currentThread().setPriority(7);
      //child thread priority same as main by default
      System.out.println("new priority (main)"+Thread.currentThread().getPriority());
      
      
      Thr2 obj=new Thr2();
      //obj.setPriority(8);//between 1 to 10 1=min 10=max
      obj.start();
      System.out.println("child thread priority "+obj.getPriority());
   }
}
