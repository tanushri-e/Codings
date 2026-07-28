class Solution {
    public String smallestPalindrome(String s) 
    {
        if(s.length()==1) return s;

        int[]freq=new int[26];
        StringBuilder left = new StringBuilder();
        String middle=""; 

        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }

        for(int i=0;i<freq.length;i++)
        {
           for(int j=0;j<freq[i]/2;j++)
            {
               left.append((char) ('a' + i));
            }

            if (freq[i] % 2 == 1) 
            {
                middle = Character.toString((char) ('a' + i));
            }
        } 
        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + middle + right;
    }
}