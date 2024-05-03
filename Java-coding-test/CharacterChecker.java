import java.util.*;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the strings contain the same characters
        if (containSameCharacters(firstString, secondString)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram.");
        }

        scanner.close();
    }

    // Function to check if two strings contain the same characters
    public static boolean containSameCharacters(String str1, String str2) {
        // Remove white spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the characters of the strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }
}

