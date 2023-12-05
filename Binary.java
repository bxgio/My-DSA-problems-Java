
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7,8,9,10};
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int x = scanner.nextInt();
        scanner.close();
        int result = binarysearch(arr, x);
        if(result == -1){
            System.out.println("not found");
        }else{
            System.out.println("found at index : "+ result);
        } 
        }

    public static int binarysearch(int[]arr,int x){
        int left = 0;
        int right = arr.length -1;
        
        while(left <= right){
            int mid = left+(right-left)/ 2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid] < x){
                 left = mid + 1;
            }else{
                 right = mid - 1;
            }
    }return -1;
}
    
}

