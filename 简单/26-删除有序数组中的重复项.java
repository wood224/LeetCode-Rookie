class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int n=nums[0];
        for(int i=1;i< nums.length;i++)
        {
            if(nums[i]!=n)
            {
                nums[k]=nums[i];
                n=nums[i];
                k++;
            }
        }
        return k;
    }
}
