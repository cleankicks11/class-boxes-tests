import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= numRows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= numRows; j++) {
                // Print asterisks for the first and last rows, and for the first and last columns
                if (i == 1 || i == numRows || j == 1 || j == numRows) {
                    System.out.print("* ");
                } else {
                    // Print spaces for inner rows and columns
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        scanner.close();
    }
}

