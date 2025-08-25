class Solution {
    public int minDistance(String s, String t) {
        int i=s.length();
        int j=t.length();
        int[][] dp = new int[i][j];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(s,t,s.length()-1, t.length()-1, dp);
    }
    public int helper(String s, String t, int i, int j, int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j] = helper(s,t,i-1,j-1,dp);
        return dp[i][j]= 1+ Math.min(helper(s,t,i-1,j-1,dp),Math.min(helper(s,t,i,j-1,dp),helper(s,t,i-1,j,dp)));
    }
}