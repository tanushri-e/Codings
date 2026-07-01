class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][]matrix = new int[n][n];

        int num=1;
        int start=0;
        int end=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        while(start<=end && top<=bottom)
        {
            for(int i=start;i<=end;i++)
            {
                matrix[top][i]=num;
                num++;
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                matrix[i][end]=num;
                num++;
            }
            end--;

            if(top<=bottom)
            {
                for(int i=end;i>=start;i--)
                {
                    matrix[bottom][i]=num;
                    num++;
                }
                bottom--;
            }

            if(start<=end)
            {
                for(int i =bottom;i>=top;i--)
                {
                    matrix[i][start]=num;
                    num++;
                }
                start++;
            }
            
        }
        return matrix;
    }
}