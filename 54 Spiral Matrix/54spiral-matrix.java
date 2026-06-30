class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int start=0;
        int end= matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        
        List<Integer> result=new ArrayList<>();
        
        while(top<=bottom && start<=end)
        {
            for(int i=start;i<=end;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][end]);
            }
            end--;

            if(top<=bottom)
            {
                for(int i=end;i>=start;i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(start<=end)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][start]);
                }
                start++;
            }
        }
        return result;
        
    }
}