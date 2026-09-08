class Solution {
    public boolean isPalindrome(String s) 
    {
        String res="";

        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                res+=Character.toLowerCase(ch);
            }
        }

        int j=res.length()-1;
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)!=res.charAt(j) && i<=j)
                return false;
            j--;
        }
        return true;   
    }
}