class ABCException extends Exception{
   ABCException(){
      super("abc exception");
   }
}
class TryCatch{
   static void testThrow(){
      try{
      throw new ABCException();
      }
      catch(ABCException e){
         System.out.println(e);
      }

   }
   public static void main(String args[])
   {
      
         testThrow();
      
      
      System.out.println("end");
   }
   
}
