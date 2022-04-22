//动态规划
class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int t = result;
        for(int i = 1; i < nums.length; i++){
            t = Math.max(nums[i], nums[i] + t);
            if(t > result)
                result = t;
        }
        return result;
    }
}
