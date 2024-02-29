import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to sort: ");
        String str =  sc.nextLine();
        sc.close();
        String ans = new String(sortString(str));
        System.out.println(ans);
    }

    public static char [] sortString(String str) {
        char [] s = str.toCharArray();
        char temp;
        for (int i = 0;i<s.length;i++){
            for(int j = i+1;j<s.length;j++){
                if(s[i]>s[j]){
                    temp = s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }return s;
    }
}
