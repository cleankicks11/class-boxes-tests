import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array to store the elements
        int[] array = new int[n];
        
        // Input array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Compute the sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        
        // Print the sum of array elements
        System.out.println("Sum of array elements: " + sum);
        
        scanner.close();
    }
}

