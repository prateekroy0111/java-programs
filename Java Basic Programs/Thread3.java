class Thread3{
   public static void main(String args[]){
   
      Thread t1 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				for(int i=1;i<6;i++){
               System.out.println("Child thread");
            }
			} 
		});//thread class obj
      t1.start();//starting child thread
      
      for(int i=1;i<6;i++){
         System.out.println("Main thread");
      } 
   }
}