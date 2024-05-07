import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits is: " + sumOfDigit(num) );
    }
    public static int sumOfDigit(int num) {
        int sum = 0;
        
        int Temp = num;
        while(Temp != 0){
            int digit = num % 10;
            sum +=digit;
            Temp /=10;
        }
        return sum;
    }
}
