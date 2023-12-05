import java.util.*;

public class occurance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in =scanner.next();
        scanner.close();
        HashMap<Character,Integer> Char = new HashMap<>();
        char [] arr = in.toCharArray();
        for (char c : arr){
            if(!Character.isWhitespace(c)){
                Char.put(c,Char.getOrDefault(c,0)+1);
            }
            
        }System.out.println(Char);
    }
}