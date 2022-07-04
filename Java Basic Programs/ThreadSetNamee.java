class Thr1 extends Thread{
   public void run(){
   }
}
class Thr12 extends Thread{
   public void run(){
   }
}
class ThreadSetNamee{
   public static void main(String args[]){
            
      Thr1 obj=new Thr1();
      obj.start();
      System.out.println(obj.getName());
      obj.setName("this is Child thread");
      System.out.println(obj.getName()+"\n");
      
      Thr12 obj2=new Thr12();
      obj2.start();
      System.out.println(obj2.getName());
      obj2.setName("this is Child thread2");
      System.out.println(obj2.getName()+"\n");
      
      System.out.println(Thread.currentThread().getName());
      Thread.currentThread().setName("this is main thread");
      System.out.println(Thread.currentThread().getName());
   }
}
