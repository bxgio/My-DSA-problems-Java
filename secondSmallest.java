public class secondSmallest {
    public static void main(String[] args) {
        int [] arr = {101,13,34,5,7,9,5,7,10};
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i =0 ;i<arr.length-1;i++){
            if (arr[i]<smallest){
                
                secSmallest =smallest;
                smallest= arr[i];

            }else if(arr[i]<secSmallest && arr[i]!=smallest){
                secSmallest =  arr[i];
            }

        }
        System.out.println("second smallest = "+secSmallest);
    }
}
