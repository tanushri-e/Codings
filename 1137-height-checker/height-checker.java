class Solution {
    public int heightChecker(int[] heights) 
    {
        int n = heights.length;
        int[]res=new int[n];
        for(int i=0;i<n;i++)
            {
                res[i]=heights[i];
            }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<n;i++)
            {
                if(res[i]!=heights[i])
                {
                    count++;
                }
            }
        return count;
    }
}