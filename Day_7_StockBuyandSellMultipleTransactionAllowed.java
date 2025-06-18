// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        int MaxProfit=0;
        int n=prices.length;
        for (int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                MaxProfit+=prices[i]-prices[i-1];
            }
        }
        return MaxProfit;
        
    }
}
