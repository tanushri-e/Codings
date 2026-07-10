class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        int ans[]=new int[n];
        a[0]=1;
        b[n-1]=1;

        for(int i=0;i<n-1;i++)
        {
            a[i+1]=a[i]*nums[i];
        }

        for(int i=n-1;i>0;i--)
        {
            b[i-1]=b[i]*nums[i];
        }

        for(int i=0;i<n;i++)
        {
            ans[i]=a[i]*b[i];
        }
        return ans;
    }
}