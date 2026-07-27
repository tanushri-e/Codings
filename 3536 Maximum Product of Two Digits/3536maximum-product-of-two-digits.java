class Solution {
    public int maxProduct(int n)
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n!=0)
        {
            int ld=n%10;
            if(max1<ld)
            {
                max2=max1;                    
                max1=ld;
            }                
            else if(max2<ld)
            {
                max2=ld;
            }
            n/=10;
        }
        return max1*max2;
    }

}