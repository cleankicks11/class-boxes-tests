import java.util.*;

public class CharTest {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

      System.out.println("Enter char to get ASCII:");
      char userChar = scanner.next().charAt(0);
      char arr[] = userChar.toCharArray();
      //String[] charArray = userChar.split("");
      int charValue = (int) userChar;
      System.out.println("Character " + userChar + "  has ASCII value: " + charValue);
  }
}
