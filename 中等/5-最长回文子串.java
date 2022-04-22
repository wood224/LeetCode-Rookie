class Solution {
    public String longestPalindrome(String s) {
        char[] cha = s.toCharArray();
        int len=1;
        int b=0;
        for (int i=0;i<cha.length;i++)
        {
            int b1=i-1;
            int e1=i+1;
            while (b1>=0&&e1<cha.length&&cha[b1]==cha[e1])
            {
                if (len<e1-b1+1)
                {
                    len=e1-b1+1;
                    b=i-(len-1)/2;
                }
                b1--;e1++;
            }
        }
        for(int i=0;i<cha.length-1;i++)
        {
            if(cha[i]==cha[i+1])
            {
                if (len<2)
                {
                    len=2;
                    b=i;
                }
                int b1=i-1;
                int e1=i+2;
                while (b1>=0&&e1<cha.length&&cha[b1]==cha[e1])
                {
                    if (len<e1-b1+1)
                    {
                        len=e1-b1+1;
                        b=i-(len-1)/2;
                    }
                    b1--;e1++;
                }
            }
        }
        return s.substring(b,b+len);
    }
}
