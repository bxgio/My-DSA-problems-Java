

public class PrefixCount {
    public static void main(String[] args) {
        String pref = "at";
        String[] words = { "attend", "attention", "loyal", "nigga", "apple", "sun", "rolex", "fat" };

        System.out.println(prefixCount(words, pref));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefLength = pref.length();
        for (String word : words) {
            if (word.length() >= prefLength && word.substring(0, prefLength).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}
