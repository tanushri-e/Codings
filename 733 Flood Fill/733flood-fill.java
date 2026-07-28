class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int startColor = image[sr][sc];
        if (startColor == color) return image;
        dfs(image,sr,sc,startColor,color);
        return image;
    }

    public void dfs(int[][] image, int i, int j, int startColor, int newColor)
    {
        if(i<0 || i>=image.length || j<0 || j>=image[0].length)
        {
            return;
        }
        if (image[i][j] != startColor)
            return;

        image[i][j] = newColor;
        
        dfs(image, i + 1, j, startColor, newColor);
        dfs(image, i - 1, j, startColor, newColor);
        dfs(image, i, j + 1, startColor, newColor);
        dfs(image, i, j - 1, startColor, newColor);
    }
}