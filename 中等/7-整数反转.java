class Solution {
    public int reverse(int x) {
        int i=0;
        if(x==0)
            return 0;
        else if (x>0)
        {
            while(x%10==0)
            {
                x=x/10;
            }
            while (x!=0)
            {
                int t=i;
                i=i*10+x%10;
                if((i-x%10)/10!=t) //判断是否超出范围
                    return 0;
                x=x/10;
            }
        }
        else
        {
            x=Math.abs(x);
            while(x%10==0)
            {
                x=x/10;
            }
            while (x!=0)
            {
                int t=i;
                i=i*10+x%10;
                if((i-x%10)/10!=t)
                    return 0;
                x=x/10;

            }
            i=i*(-1);
        }
          return i;
    }
}