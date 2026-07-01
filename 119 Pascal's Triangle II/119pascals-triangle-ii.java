class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<List<Integer>>res=new ArrayList<>();
            long num=1;
            List<Integer>row=new ArrayList<>();

            for(int j=0;j<=rowIndex;j++)
            {
                row.add((int)num);
                num=num*(rowIndex-j)/(j+1);
            }
        return row;
    }
    
}
