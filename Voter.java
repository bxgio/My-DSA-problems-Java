public class Voter {    //Boyer Moore Voter Algorithm
    public static void main(String[] args) {
        int [] nums ={52,5,4,6,7,8,3,3,3,4,4};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int voter = nums[0];
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] == voter){
                count ++;
            }else if (nums[i] != voter ){
                count --;
            }if (count ==0){
                voter = nums[i];
                count++;
            }
                
            }return voter;
        }
}
