

class Solution {
    public int maximumProfit(int prices[]) {
        int buy=prices[0], profit=0, n=prices.length;
        
        for(int i=1;i<n;i++){
            if(prices[i]<=buy){
                buy=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
        
    }
}
