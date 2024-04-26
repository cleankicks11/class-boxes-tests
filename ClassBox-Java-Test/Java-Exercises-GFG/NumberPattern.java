import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print numbers in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
        
        scanner.close();
    }
}

