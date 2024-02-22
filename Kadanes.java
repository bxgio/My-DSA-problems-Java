

//used to find the maximum contigeous sum of a subarray within the given array
public class Kadanes {
    public static int maxSubArraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i =1;i<nums.length;i++){
            maxEndingHere = Math.max(nums[i],maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6,7,8,3,0};
        System.out.println("maximum = "+ maxSubArraySum(nums));
    }
}
