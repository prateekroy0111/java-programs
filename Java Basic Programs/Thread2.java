class T2 implements Runnable{
//only one method in runnable interface i.e run
   public void run(){
      int i;
      for(i=1;i<6;i++){
         System.out.println("Child thread");
      }
   }
}
class Thread2{
   public static void main(String args[]){
      T2 obj=new T2();//own thread obj
      Thread t=new Thread(obj);//thread class obj
      t.start();//starting child thread
      for(int i=1;i<6;i++){
         System.out.println("Main thread");
      } 
   }
}