import java.util.*;
//Exception classes
class WithdrawMoneyException extends Exception{
  WithdrawMoneyException(String errMsg){
    super(errMsg);
  }
}

class DepositMoneyException extends Exception{
  DepositMoneyException(String errMsg){
    super(errMsg);
  }
}

class TransferMoneyException extends Exception{
  TransferMoneyException(String errMsg){
    super(errMsg);
  }
}

class Client{
  public void Withdraw(float amount) throws WithdrawMoneyException {
    //max withdraw 1000
    if(amount <= 1000){
      //substract balance
      System.out.println("You are attempting to withdraw: " + amount);
    } else {
      throw new WithdrawMoneyException("Cannot withdraw more than $1000 per transaction");
    }
  }

  public void Deposit(float amount) throws DepositMoneyException {
if(amount <= 1000){
      //substract balance
      System.out.println("You are attempting to deposit: " + amount);
    } else {
      throw new DepositMoneyException("Cannot deposit more than $1000 per transaction");
    }

  }

  public void Transfer(float amount) throws TransferMoneyException {
if(amount <= 1000){
      //substract balance
      System.out.println("You are attempting to transfer: " + amount);
    } else {
      throw new TransferMoneyException("Cannot transfer more than $1000 per transaction");
    }

  }

}

public class BankingUser{
  public static void main(String[] args) {
    Client Banker1 = new Client();
    Scanner scanner = new Scanner(System.in);
    
    boolean transaction = true;

    while(transaction){
      System.out.print("Hello, Welcome to Java Bank! Enter Your selection:\n");
      System.out.print("1: Withdraw\n");
      System.out.print("2: Deposit\n");
      System.out.print("3: Transfer\n");

      int choice = scanner.nextInt();
      
      switch (choice) {
        case 1:
          try {
            System.out.println("Enter amount to withdraw:");
            float withdrawAmount = scanner.nextFloat();
            Banker1.Withdraw(withdrawAmount);
          } catch (WithdrawMoneyException e) {
            System.out.println(e.getMessage());
          }
          break;
        case 2:
          try {
            System.out.println("Enter amount to deposit:");
            float depositAmount = scanner.nextFloat();
            Banker1.Deposit(depositAmount);
          } catch (DepositMoneyException e) {
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          try {
            System.out.println("Enter amount to transfer:");
            float transferAmount = scanner.nextFloat();
            Banker1.Transfer(transferAmount);
          } catch (TransferMoneyException e) {
            System.out.println(e.getMessage());
          }
          break;
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
        }
      System.out.println("Do you want to exit the transaction menu? (y/n)");
      String exitInput = scanner.next();
      if (exitInput.equalsIgnoreCase("y")) {
                transaction = false;
            }
    }
        scanner.close();
  }
}
