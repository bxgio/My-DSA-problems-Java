import java.util.*;

public class sampi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String a = scanner.nextLine();
        System.out.print("Enter sub string: ");
        String b = scanner.nextLine();
        int is = issub(a, b);
        System.out.println(is);
        scanner.close();
    }
    public static int issub(String A,String B){
        int a = A.length();
        int b = B.length();
        for(int i =0;i<=a-b;i++){
            boolean match = true;
            for(int j = 0;j<b;j++){
                if(A.charAt(i+j)!=B.charAt(j)){
                    match = false;
                    break;
                }
            }if(match){
                return i;
            }
        }return -1;
    }
}
