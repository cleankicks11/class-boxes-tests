import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();
        
        // Use two pointers to compare characters from the start and end of the string
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // If characters at the current positions are not equal, return false
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center of the string
            left++;
            right--;
        }
        // If the loop completes without returning false, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the input string is a palindrome
        boolean isPalin = isPalindrome(input);
        
        // Print the result
        if (isPalin) {
            System.out.println("Yes, the string is a palindrome.");
        } else {
            System.out.println("No, the string is not a palindrome.");
        }
        
        scanner.close();
    }
}

