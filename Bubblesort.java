import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={6,8,8,9,5,4,8,2};
        sort(arr);
        String a =Arrays.toString(arr);
        System.out.print(a);
        
    }
    public static void sort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length -1;j++){
               if(arr[i]>arr[j]){
                swap(arr, i, j);
               }
            }
        }
    }
    public static int[] swap(int[]arr,int a, int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
}