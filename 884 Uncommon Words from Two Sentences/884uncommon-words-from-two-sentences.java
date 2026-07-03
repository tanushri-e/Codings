class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        Map<String,Integer>map=new HashMap<>();

        String str=s1+" "+s2;

        for(String s:str.split(" "))
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        List<String>res=new ArrayList<>();

        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                res.add(entry.getKey());
            }
        }
        return res.toArray(new String[0]);

    }
}