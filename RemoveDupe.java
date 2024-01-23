

import java.util.*;
class RemoveDupe {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,6,7,7,7,8};
        System.out.println(removeDuplicates(arr));
        
      
    }
    public static HashSet<Integer> removeDuplicates(int[] nums) {
        HashSet <Integer> hash = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }

        return hash;
    }
}
