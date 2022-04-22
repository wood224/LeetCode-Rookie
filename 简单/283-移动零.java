class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int i = 0;
        int j = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j++;
            }
        }
    }
}
