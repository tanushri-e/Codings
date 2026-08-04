class Solution {
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length()) return false;

        int[]tfreq=new int[26];

        int[]sfreq=new int[26];

        for(char ch:s.toCharArray())
        {
            sfreq[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            tfreq[ch-'a']++;
        }
        for(int i=0;i<sfreq.length;i++)
        {
            if(sfreq[i]!=tfreq[i])
                return false;
        }
        return true;
    }
}