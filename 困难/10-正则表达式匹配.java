class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        s = " " + s;
        p = " " + p;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            for (int j = 1; j < cp.length; j++) {
                if(j+1<cp.length&&cp[j+1]=='*')
                    continue;
                if (cp[j] != '*')
                    dp[i][j] = (i>0 && j>0 && dp[i - 1][j - 1]) && (cs[i] == cp[j] || cp[j] == '.');
                else if (cp[j] == '*') {
                    dp[i][j] = (j >= 2 && dp[i][j - 2]) || (i>0 && j>0 && dp[i - 1][j] && (cp[j-1]==cs[i]||cp[j-1]=='.'));
                }
            }
        }
        return dp[n][m];
    }

}