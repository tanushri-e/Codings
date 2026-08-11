class Solution {
    public int buyChoco(int[] prices, int money) 
    {
        Arrays.sort(prices);
        int i=0;
       if(money-(prices[i]+prices[i+1])>=0)
            money=money-(prices[i]+prices[i+1]);
        else
            return money;
        return money;
    }
    
}