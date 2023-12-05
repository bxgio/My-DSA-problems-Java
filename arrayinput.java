import java.util.*;

public class arrayinput {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        for (int i=0,j=1;i<n;i++,j++){ 
            System.out.print("enter " +j+ ": ");
            int p =scanner.nextInt();
            arr.add(p);
        }
        scanner.close();
            System.out.print(arr);

        }

    }
