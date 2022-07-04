import java.util.Scanner;

class LowBalanceException extends Exception{
   public LowBalanceException(){
      super("Insufficient Balance");
   }
}

class ExceptionTest
{
   public void atm(int m) throws LowBalanceException{
      int balance=m;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter withdraw amount: ");
      int withdraw=sc.nextInt();
      if(balance<withdraw)
      {
         throw new LowBalanceException();
      }
      else{
         int remain=balance-withdraw;
         System.out.println("Remaining Balance: "+remain);
      }
   }
}
public class UserException{
   public static void main(String args[]){
      ExceptionTest obj=new ExceptionTest();
      try{
         obj.atm(10000);
      }
      catch(LowBalanceException e){
         System.out.println(e);
      }
      
   }
}