class Solution {
    public int mirrorFrequency(String s) 
    {
        int sum=0;

        int[]freq_alpha=new int[26];

        int[]freq_num=new int[10];

        for(char ch:s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                freq_alpha[ch-'a']++;
            }
            else
            {
               if(Character.isDigit(ch))
               {
                freq_num[ch-'0']++;
               }
            }
        }

        for(int i=0, j=freq_alpha.length-1; i<=j; i++,j--)
        {
            sum+=Math.abs(freq_alpha[i]-freq_alpha[j]);
        }

        for(int i=0, j=freq_num.length-1; i<=j; i++,j--)
        {
            sum+=Math.abs(freq_num[i]-freq_num[j]);
        }
    return sum;
    }
}