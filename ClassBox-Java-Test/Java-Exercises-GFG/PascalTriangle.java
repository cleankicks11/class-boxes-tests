import java.util.Scanner;

public class PascalTriangle {
    // Function to calculate and print Pascal's Triangle
    public static void printPascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        
        // Fill Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // Set edge values to 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Calculate other values using the formula C(n, k) = C(n-1, k-1) + C(n-1, k)
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        
        // Print Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        
        // Print Pascal's Triangle
        printPascalTriangle(numRows);
        
        scanner.close();
    }
}

