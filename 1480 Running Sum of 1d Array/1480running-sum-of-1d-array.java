class Solution {
    public int[] runningSum(int[] nums) 
    {
        int[]res=new int[nums.length];
        int sum=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            res[k]=sum;
            k++;
        }
        return res;
    }
}