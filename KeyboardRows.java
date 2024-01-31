
import java.util.*;


public class KeyboardRows {
    public static String[] find(String[] words) {
        char[] firstRow = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] secondRow = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] thirdRow = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            boolean isOneRow = true;

            char[] rowChars;
            char firstChar = lowercaseWord.charAt(0);
            if (containsChar(firstRow, firstChar)) {
                rowChars = firstRow;
            } else if (containsChar(secondRow, firstChar)) {
                rowChars = secondRow;
            } else {
                rowChars = thirdRow;
            }

            for (char c : lowercaseWord.toCharArray()) {
                if (!containsChar(rowChars, c)) {
                    isOneRow = false;
                    break;
                }
            }

            if (isOneRow) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean containsChar(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = find(words);
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}

   