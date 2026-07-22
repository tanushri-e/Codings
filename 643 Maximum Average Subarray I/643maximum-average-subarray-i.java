class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int i=0;
        double avg=0;
        double max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++)
        {
            avg+=nums[j];   
            if(j-i+1==k)
            {
                max=Math.max(max,avg/k);
                avg-=nums[i];
                i++;
            }
        }
        return max;
    }
}