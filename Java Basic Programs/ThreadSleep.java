class ThreadSleep{
   public static void main(String args[]) throws InterruptedException{
   //hadle exception while using sleep method
      for(int i=1;i<6;i++){
         System.out.println("Main thread "+i);
         Thread.sleep(2000,500);//milli n nano sec 
         //Thread.sleep(2000);//milli
      } 
   }
}