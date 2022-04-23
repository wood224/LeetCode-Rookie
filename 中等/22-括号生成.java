class Solution {
    ArrayList<String> a = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        dfs(0,0,n,"");
        return a;
    }
    public void dfs(int l,int r,int n,String s)
    {
        if(l==n&&r==n)
            a.add(s);
        if(l<n)
            dfs(l+1,r,n,s+"(");
        if (r<n&&r<l)
            dfs(l,r+1,n,s+")");
    }
}