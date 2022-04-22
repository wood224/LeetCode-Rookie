class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1)
        {
            if(nums[0]<target)
                return 1;
            else
                return 0;
        }
        if(nums[nums.length-1]<target)
            return nums.length;
        if (nums[0]>=target)
            return 0;
        else {
            int b=0;
            for (int i=nums.length/2;i>=0;i/=2)
            {
                if(nums[b+i]<target) {
                    if(i==0)
                        return b+1;
                    else{
                        b=b+i;
                        i++;
                    }
                }
                else if(nums[b+i]==target)
                    return b+i;
                else
                {
                    if(i==0)return b;
                }
            }
        }
        return -1;
    }
}
