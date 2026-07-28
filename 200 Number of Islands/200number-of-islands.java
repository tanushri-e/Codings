class Solution {
    public int numIslands(char[][] grid) 
    {
        int island =0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs(char[][]grid,int i,int j)
   {
        //base case
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ||grid[i][j]=='0')            
        {
             return;
        }

        //mark as visited
        grid[i][j]='0';
        dfs(grid,i+1,j); //bottom
        dfs(grid,i-1,j); //top
        dfs(grid,i,j+1); //right
        dfs(grid,i,j-1); //left
    
    }    
}