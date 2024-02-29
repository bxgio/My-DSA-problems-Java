import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        scanner.close();

        boolean result = isAnagram(s, t);
        
        if (result) {
            System.out.println("The strings '" + s + "' and '" + t + "' are anagrams.");
        } else {
            System.out.println("The strings '" + s + "' and '" + t + "' are not anagrams.");
        }
    }

    public static boolean isAnagram(String s, String t) {
        // If the lengths of the two strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare sorted character arrays
        return Arrays.equals(sChars, tChars);
    }
}
