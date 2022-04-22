class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int num=(r-l)*Math.min(height[l],height[r]);
        while (l!=r)
        {
            if (height[l]<height[r])
                l++;
            else
                r--;
            num=Math.max(num,(r-l)*Math.min(height[l],height[r]));
        }

        return num;
    }
}
