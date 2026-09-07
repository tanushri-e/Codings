class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            if(map.containsKey(nums[i]))
            {
                if(map.get(nums[i])>=2)
                    return true;
            }
        }
        return false;
    }
}