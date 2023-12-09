import java.util.*;


public class factorial {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fact(n));

    }
    public static int fact(int n){
       
        if (n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
