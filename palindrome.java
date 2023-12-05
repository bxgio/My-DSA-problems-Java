import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.next();
        boolean result =isPalindrome(s);
        System.out.println(result);
        scanner.close();
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
}
}
