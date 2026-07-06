class Solution {
    public int findChampion(int[][] grid) 
    {
        int n=grid.length;
        int max=0;
        int position=-1;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1) 
                {
                    count++;
                 }
                                
                if(max<count) 
                {
                    max=count;
                    position=i;
                }
            }
        }
    return position;
    }
}