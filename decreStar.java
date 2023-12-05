import java.util.*;

public class increStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("no of columns: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
