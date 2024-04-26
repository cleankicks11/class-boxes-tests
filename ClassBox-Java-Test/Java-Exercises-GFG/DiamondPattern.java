import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();
        
        // Upper half of the diamond
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = numRows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        
        scanner.close();
    }
}

