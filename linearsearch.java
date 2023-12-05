import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,7,8,9,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target: ");
        int target = sc.nextInt();
        sc.close();
        int a =linear(arr, target);
        if(a!= -1){
            System.out.println("found at index: "+a);
        }else{
            System.out.println("not found");
        }
    }
    public static int linear(int[]arr,int target){
        for (int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }    
}
