class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        if(trust.length==0 && n==1)
        {
            return 1;
        }
        int[]score=new int[n+1];

        for(int[] person:trust)
        {
            int ai=person[0];
            int bi=person[1];
            score[ai]--;
            score[bi]++;
        }

        for(int i=0;i<score.length;i++)
        {
            if(score[i]==n-1) return i;
        }
        return -1;
    }
}