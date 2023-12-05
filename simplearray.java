import java.util.*;

public class simplearray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        int[] arr =new int[n];
        for (int i =0,p=1;i<n;i++,p++){
            System.out.print("Enter "+p+": ");
            int j = scanner.nextInt();
            arr[i]=j;
        }
        scanner.close(); 
        String ans = Arrays.toString(arr);
        System.out.println(ans);
    }
}
