import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int x = scanner.nextInt();
        System.out.println(isLeap(x));
        scanner.close();

    }
    public static boolean isLeap(int a){
        if ((a%4==0) && (a%100 ==0) || (a%400 == 0)){
            return true;
        }
        return false;
    }
}
