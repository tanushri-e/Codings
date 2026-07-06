class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        int[]freq=new int[26];
        int count=0;
        for(char ch:sentence.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=1)
                count++;
        }

        if(count==26)
        {
            return true;
        }

    return false;   
    }
}