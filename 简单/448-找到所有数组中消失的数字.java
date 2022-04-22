class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            int t = (nums[i] - 1) % n;
            nums[t] += n;
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if (nums[i] <= n) {
                res.add(i+1);
            }
        }
        return res;
    }
}
