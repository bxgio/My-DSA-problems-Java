

//without using StringBuilder class 

public class StringSwap {
    public static void main(String[] args) {
       String str = "bagio";
       System.out.println(strswp(str)); 
    }
    
    public static String strswp(String str) {
        char[] charArray = str.toCharArray();
        
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[str.length() - i - 1];
            charArray[str.length() - i - 1] = temp;
        }
        
        return new String(charArray);
    }
}
