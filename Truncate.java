//Leetcode 1816 Truncate Sentence Problem

public class Truncate {
    public String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
        String [] container = new String[k];
        for (int i = 0;i<k;i++){
            container[i]=str[i];
        }
        String result = String.join(" ",container);
        return result;
    }

    public static void main(String[] args) {
        Truncate truncate = new Truncate();

        // Test cases
        String s1 = "Hello world how are you";
        int k1 = 3;
        System.out.println(truncate.truncateSentence(s1, k1)); // Output: "Hello world how"

        String s2 = "I am learning Java programming";
        int k2 = 5;
        System.out.println(truncate.truncateSentence(s2, k2)); // Output: "I am learning Java programming"

        String s3 = "This is a test sentence";
        int k3 = 1;
        System.out.println(truncate.truncateSentence(s3, k3)); // Output: "This"
    }
}
