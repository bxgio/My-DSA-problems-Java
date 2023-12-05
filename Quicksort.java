import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2,6,4,5,3,5};
        quickSort(arr, 0, arr.length-1);
        String a =Arrays.toString(arr);
        System.out.println(a);
    }
    public static void quickSort(int[] arr, int low,int high){
        if(low<high){
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex -1);
        quickSort(arr, pivotIndex+1,high);
        }
    }

    public static int partition(int[] arr,int low, int high){
        int pivot =arr[high];
        int i = low -1;
        for (int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, j, i);
            }
        }swap(arr,i+1,high);
        return i+1;
    }

    public static int[] swap(int[] arr,int a,int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
}