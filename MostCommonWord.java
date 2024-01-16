import java.util.*;
import java.util.regex.Pattern;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert the paragraph to lowercase and split into words
        String[] words = paragraph.toLowerCase().split("\\W+");

        // Create a set to store banned words for faster lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Create a frequency map for words
        Map<String, Integer> wordFreq = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            // Remove non-alphanumeric characters from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            // Check if the word is not in the banned set
            if (!bannedSet.contains(word)) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        // Find the most common word
        String mostCommonWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostCommonWord;
    }

    public static void main(String[] args) {
        MostCommonWord solution = new MostCommonWord();
        String paragraph = "This is an example paragraph. This paragraph is just an example.";
        String[] bannedWords = {"this", "is", "an"};

        String result = solution.mostCommonWord(paragraph, bannedWords);
        System.out.println(result);
    }
}
