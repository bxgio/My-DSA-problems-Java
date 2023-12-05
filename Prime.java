import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = scanner.nextInt();
        System.out.println(isPrime(x));

        scanner.close();
    }
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }for (int i = 2;i<=n/2;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    
}
