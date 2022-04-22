class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int l = 1, r = 2;
        int count = 0;
        for(int i = 3; i <= n; i++){
            count = l + r;
            l = r;
            r = count;
        }
        return count;
    }
}
