import java.util.Scanner;

public class Factorial {
    
    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        // Checking if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
        
        scanner.close();
    }
}

