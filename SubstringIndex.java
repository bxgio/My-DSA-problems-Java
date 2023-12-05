import java.util.Scanner;//still to learn

public class SubstringIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the main string and the substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        // Find the index of the start of the substring
        int startIndex = findSubstringIndex(mainString, substring);

        // Display the result
        if (startIndex != -1) {
            System.out.println("The substring starts at index: " + startIndex);
        } else {
            System.out.println("Substring not found in the main string.");
        }

        scanner.close();
    }

    // Function to find the index of the start of a substring
    private static int findSubstringIndex(String mainString, String substring) {
        int mainLength = mainString.length();
        int subLength = substring.length();

        for (int i = 0; i <= mainLength - subLength; i++) {
            // Check if the substring matches starting from index i
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != substring.charAt(j)) {
                    match = false;
                    break;
                }
            }

            // If a match is found, return the current index
            if (match) {
                return i;
            }
        }

        // If the loop completes without finding a match, return -1
        return -1;
    }
}
