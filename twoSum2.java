import java.util.*;

public class twoSum2 {
public static void main(String[] args) {
    int[] nums = {2,4,5,6,7,8,7,5,3};
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the Target: ");
    int target = sc.nextInt();
    sc.close();
    int[] ans = twoSum(nums, target);

    System.out.println(Arrays.toString(ans));
}

    public  static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[1]=i;
                result[0]=map.get(target -nums[i]);
                return result;
            }map.put(nums[i],i);
            
        }return result;
    }
}