import java.util.Scanner;

public class SubstringReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String originalString = scanner.nextLine();

        // Input the substring to be replaced
        System.out.println("Enter the substring to be replaced:");
        String substringToReplace = scanner.nextLine();

        // Input the replacement substring
        System.out.println("Enter the replacement substring:");
        String replacementSubstring = scanner.nextLine();

        // Perform the replacement
        String replacedString = replaceSubstring(originalString, substringToReplace, replacementSubstring);

        // Output the replaced string
        System.out.println("Replaced string:");
        System.out.println(replacedString);

        scanner.close();
    }

    // Function to replace each substring of a given string
    public static String replaceSubstring(String originalString, String substringToReplace, String replacementSubstring) {
        // Check if the original string contains the substring to be replaced
        if (!originalString.contains(substringToReplace)) {
            return originalString; // If not, return the original string
        }

        // Replace the substring in the original string
        return originalString.replaceAll(substringToReplace, replacementSubstring);
    }
}

