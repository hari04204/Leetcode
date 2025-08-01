class Solution {
    // public int maxProfit(int[] prices) {
    //     return helper(prices, 0, -1);
    // }

    // public int helper(int[] prices, int i, int lastBought) {
    //     if (i == prices.length)
    //         return 0;
    //     if (lastBought != -1) {
    //         return Math.max(helper(prices, i + 1, lastBought), helper(prices, i + 1, -1) + (prices[i]-lastBought));
    //     }
    //     return Math.max(helper(prices, i + 1, prices[i]), helper(prices, i + 1, -1));
    // }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(prices, 0, 0, dp);
    }

    public int helper(int[] prices, int i, int lastBought, int[][] dp) {
        if (i == prices.length)
            return 0;
        if(dp[i][lastBought]!=-1) return dp[i][lastBought];
        int profit = 0;
        if (lastBought == 1) {
            profit = Math.max(helper(prices, i + 1, 1, dp), helper(prices, i + 1, 0, dp)+prices[i]);
        }
        else profit =  Math.max(helper(prices, i + 1, 1, dp)-prices[i], helper(prices, i + 1, 0, dp));
        dp[i][lastBought] = profit;
        return profit;
    }
}