import java.util.Scanner;

public class FibonacciSum {
    // Function to calculate the Fibonacci series and return the sum
    public static int fibonacciSum(int numTerms) {
        int sum = 0;
        int firstTerm = 0;
        int secondTerm = 1;
        
        for (int i = 1; i <= numTerms; i++) {
            sum += firstTerm; // Add the current term to the sum
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        
        // Calculate the sum of Fibonacci series
        int sum = fibonacciSum(numTerms);
        
        // Print the sum of Fibonacci series
        System.out.println("Sum of Fibonacci series up to " + numTerms + " terms: " + sum);
        
        scanner.close();
    }
}

