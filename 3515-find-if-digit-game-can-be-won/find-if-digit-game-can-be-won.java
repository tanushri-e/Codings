class Solution {
    public boolean canAliceWin(int[] nums) 
    {
        int sd=0;
        int dd=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=digitcount(nums[i]);
            if(count==1) sd+=nums[i];
            if(count==2) dd+=nums[i];
        }
        if(sd>dd||dd>sd)
            return true;
        return false;
    }
    public int digitcount(int num)
    {
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }




}