import java.util.*;

class PinMisMatchException extends Exception {
  public PinMisMatchException(String message){
    super(message);
  }
}

public class ATM{
  private static final int validPin = 4533;
  private static final int maxAttempts = 3;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = scanner.nextLine();

    int attempts = 0;
    while(attempts < maxAttempts){
      System.out.print("Enter your PIN: ");
      int pin = scanner.nextInt();

      if(pin == validPin){
        System.out.println("Hello " + name + ", Pin Correct.");
        System.out.println("You are Successful Login..");
        System.out.println("Thank You...");
        break;
      } else {
        System.out.println("You have entered invalid pin no.");
        attempts++;
      }
    }
    if (attempts == maxAttempts){
      try{
        throw new PinMisMatchException("Sorry " + name + ", account locked");
      } catch (PinMisMatchException e){
        System.out.println("PinMisMatchException: " + e.getMessage());
      }
    }
  }
}
