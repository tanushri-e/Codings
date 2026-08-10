class Solution {
    public List<Integer> findMissingElements(int[] nums)
    {
        List<Integer>lst=new ArrayList<>();
        Arrays.sort(nums);
        int start=nums[0];
        int end=nums[nums.length-1];

        while(start<end)
        {
            boolean found=false;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]==start+1)
                {
                    start++;
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                lst.add(start+1);
                start++;
            }
        }
        return lst;
    }
}