public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,6,7,8,3};
        int target = 6;
        boolean found = false;
        for (int i = 0; i<arr.length -1;i++){
            for (int j = 1;j<arr.length;j++){
                int one =arr[i];
                int two = arr[j];
                int sum = one + two;
                if (sum == target ){
                    System.out.println("the numbers are "+one+" : "+two);
                    found = true;
                }
            }
        }if(!found){
            System.out.println("Not, found");
        }
    }
}
