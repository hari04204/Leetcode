class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);
        for(int i = 2; i<nums.length-1; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        int dp1 = dp[n-2];
        dp[0] = nums[1];
        dp[1] = Math.max(nums[1],nums[2]);
        for(int i = 3; i<nums.length; i++){
            dp[i-1] = Math.max(dp[i-2],dp[i-3]+nums[i]);
        }
        return Math.max(dp1, dp[n-2]);
    }
}