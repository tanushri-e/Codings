class Solution {
    public List<Integer> findMissingElements(int[] nums)
    {
        boolean[] found=new boolean[101];
        int min=100;
        int max=0;

        for(int num:nums)
        {
            if(num<min)
                min=num;
            if(num>max)
                max=num;
            found[num]=true;
        }

        List<Integer>lst=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!found[i])
            {
                lst.add(i);
            }
        }
        return lst;

    }
}