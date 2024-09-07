class Solution {
    public int maxProfit(int[] prices) {
        int buyAt = prices[0];
        int profit = 0;
        for(int i: prices){
            if(i<buyAt){
                buyAt = i;
            }
            profit = Math.max(profit, i-buyAt);
        }
        return profit;
    }
}