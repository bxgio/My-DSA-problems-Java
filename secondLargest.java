public class secondLargest {
    public static void main(String[] args) {
        int [] arr = {3,4,5,66,4,6,56,8,76,89};
        int largest= Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest= arr[i];

            }else if(arr[i]>seclargest && arr[i]!= largest){
                seclargest = arr[i];
            }
        }System.out.println("second largest = "+seclargest);
    }
}
