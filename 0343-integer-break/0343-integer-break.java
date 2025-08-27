class Solution {
    public int integerBreak(int n) {
        Integer[] memo = new Integer[n+1];
        return solve(n, memo);
    }
    public int solve(int n, Integer[] memo){
        if(n==1) return 1;
        if(memo[n]!=null) return memo[n];
        int ans = 0;
        for(int i=1; i<n; i++){
            ans=Math.max(ans,Math.max(i*(n-i),i*solve(n-i,memo)));
        }
        return memo[n] = ans;
    }
}