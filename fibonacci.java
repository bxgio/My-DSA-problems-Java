
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i =0; i<n ;i++){
            System.out.print("  "+fibbo(i));
        }
        
        }
    
    public static int fibbo(int n ){
        if (n<2){
           return n;
        }
        else{
            return fibbo(n-1)+fibbo(n-2);
            
        }
    }
}

