import java.util.Scanner;

public class LargestElementInArray {
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
        
        // Find the largest element in the array
        int largest = array[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        // Print the largest element
        System.out.println("Largest element in the array: " + largest);
        
        scanner.close();
    }
}

