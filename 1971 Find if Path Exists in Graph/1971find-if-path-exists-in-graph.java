class Solution {

    //Creating Adjaceny List
    List<List<Integer>>adj=new ArrayList<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[]edge:edges)
        {
            int ui=edge[0];
            int vi=edge[1];

            adj.get(ui).add(vi);

            adj.get(vi).add(ui);
        }

        boolean visited[]=new boolean[n];

        dfs(source,visited);

        return visited[destination];

    }
    public void dfs(int start,boolean visited[])
    {
        visited[start]=true;

        List<Integer>neighbour=adj.get(start);

        for(int vertex:neighbour)
        {
            if(!visited[vertex])
            {
                dfs(vertex,visited);
            }
        }
    }
}