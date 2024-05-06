import java.util.*;

public class ATM{
  protected String accountName;
  protected int accountPin;

  ATM(String accountName, int accountPin){
    this.accountName = accountName;
    this.accountPin = accountPin;
  }

  static String Pin() throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Pin: ");
    int pinNumber = scanner.nextInt();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 // Menu loop
        while (true) {
            System.out.println("\n1: Enter Pin");
            System.out.println("2: Return Card ");
            System.out.print("Enter your choice to use ATM today!");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    Pin();
                    break;
                case 2:
                    System.out.println("Returning Card");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        // Close the Scanner object
        scanner.close();
    }

  }
}
