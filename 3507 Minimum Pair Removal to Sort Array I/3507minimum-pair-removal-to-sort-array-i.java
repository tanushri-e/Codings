class Solution {

    public static boolean isSorted(List<Integer>list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) 
    {
        List<Integer>result=new ArrayList<>();

        for(int num:nums)
        {
            result.add(num);
        }

        int Operation=0;

        while(!isSorted(result))
        {
            int minSum=Integer.MAX_VALUE;
            int index=-1;

            for(int i=0;i<result.size()-1;i++)
            {
                int sum=result.get(i)+result.get(i+1);

                if(sum<minSum)
                {
                    minSum=sum;
                    index=i;
                }
            }
            result.set(index,minSum);
            result.remove(index+1);
            Operation++;      
        }
        return Operation;
    }
}