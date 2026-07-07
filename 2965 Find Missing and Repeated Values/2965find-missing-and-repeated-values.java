class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
      Map<Integer,Integer>map=new HashMap<>();

      int n=grid.length;

      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[i].length;j++)
        {
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
      }

      int missing =-1;
      int repeat=-1;
      for(int i=1;i<=n*n;i++)
      {
        int freq=map.getOrDefault(i,0);

        if(freq==0)
            missing=i;

        if(freq==2)
            repeat=i;
      }
    return new int[]{repeat,missing};
    }
}