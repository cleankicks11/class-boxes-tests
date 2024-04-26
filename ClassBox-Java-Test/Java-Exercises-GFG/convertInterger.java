import java.util.Scanner;

public class convertInterger {
    
    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu for user to select conversion type
        System.out.println("Select Conversion Type:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimalInput = scanner.nextInt();
                String binaryResult = decimalToBinary(decimalInput);
                System.out.println("Binary equivalent: " + binaryResult);
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                String binaryInput = scanner.next();
                int decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal equivalent: " + decimalResult);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}

