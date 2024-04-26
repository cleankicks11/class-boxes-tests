import java.util.Scanner;

public class addingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        // Swapping the numbers
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        scanner.close();
    }
}

