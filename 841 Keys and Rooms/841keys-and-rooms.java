class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms)
    {
       boolean[]visited=new boolean[rooms.size()];

       dfs(0,visited,rooms); 

       for(int i=0;i<visited.length;i++)
       {
            if(!visited[i]) return false;
       }
       return true;
    }

    public void dfs(int start,boolean[]visited,List<List<Integer>>rooms)
    {
        visited[start]=true;

        List<Integer>neighbour=rooms.get(start);

        for(int key:neighbour)
        {
            if(!visited[key])
            {
                dfs(key,visited,rooms);
            }
        }
    }
}