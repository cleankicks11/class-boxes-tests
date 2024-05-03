import java.util.*;

public class Read{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    String userInput1 = scanner.nextLine();

    System.out.println("The name entered is: " + userInput1);
    scanner.close();
  }
}
