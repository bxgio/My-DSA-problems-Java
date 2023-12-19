class RemoveDupe {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,6,7,7,7,8};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
