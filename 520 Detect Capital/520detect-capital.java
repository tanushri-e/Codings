class Solution {
    public boolean detectCapitalUse(String word) 
    {   int ucount=0,lcount=0,i=0;
        for(char ch: word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                ucount++;
            }

            if(Character.isLowerCase(ch))
            {
                lcount++;
            }
        }
        if(ucount==word.length()||lcount==word.length()||Character.isUpperCase(word.charAt(0))&&lcount == word.length() - 1 )
        {
            return true;
        }
        return false;
    }

}