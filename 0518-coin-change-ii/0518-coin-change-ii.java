class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        return helper(n-1, coins, amount,dp);
    }
    public int helper(int i, int[] coins, int target, int[][] dp){
        if(i==0){
            if(target%coins[i]==0) return 1;
            else return 0;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        int take = 0;  
        if(target-coins[i]>=0) take = helper(i,coins,target-coins[i],dp);
        int skip =  helper(i-1, coins, target,dp);
        return dp[i][target] = take+skip;
    }
}