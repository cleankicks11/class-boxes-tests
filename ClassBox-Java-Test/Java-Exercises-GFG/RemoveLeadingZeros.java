import java.util.Scanner;

public class RemoveLeadingZeros {
    public static String removeLeadingZeros(String str) {
        // Find the index of the first non-zero character
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        
        // Return the substring starting from the first non-zero character
        return str.substring(i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with leading zeros: ");
        String input = scanner.nextLine();
        
        // Remove leading zeros from the input string
        String result = removeLeadingZeros(input);
        
        // Print the result
        System.out.println("String after removing leading zeros: " + result);
        
        scanner.close();
    }
}

