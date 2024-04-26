import java.util.Scanner;

public class StringReversal {
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Initialize pointers for the start and end of the array
        int left = 0;
        int right = charArray.length - 1;
        
        // Swap characters from start and end until they meet in the middle
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the input string
        String reversedString = reverseString(input);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
}

