class Solution {
    // brute recursion
    // public boolean isMatch(String s, String p) {
    //     return helper(s,p,0,0);
    // }
    // public boolean helper(String s, String p, int i, int j){
    //     if(i==s.length() && j==p.length()) return true;
    //     if(i==s.length() && p.charAt(j)=='*') return helper(s,p,i,j+1);
    //     else if(i==s.length() || j==p.length()) return false;
    //     if(s.charAt(i)==p.charAt(j)) return helper(s,p,i+1,j+1);
    //     if(p.charAt(j)=='*') return helper(s,p,i+1,j+1) || helper(s,p,i+1,j) || helper(s,p,i,j+1);
    //     if(p.charAt(j)=='?') return helper(s,p,i+1,j+1);
    //     return false;
    // }

    // memoized recursion

    // public boolean isMatch(String s, String p){
    //     int m = s.length(), n = p.length();
    //     Boolean[][] dp = new Boolean[m+1][n+1];
    //     return helper(s,p,0,0,dp);
    // }
    // public boolean helper(String s, String p, int i, int j, Boolean[][] dp){
    //     if(i==s.length() && j==p.length()) return true;
    //     if(dp[i][j]!=null) return dp[i][j];
    //     if(i==s.length()){
    //         while(j<p.length() && p.charAt(j)=='*') j++;
    //         return j==p.length();
    //     }
    //     if(j==p.length()) return dp[i][j]=false;
    //     if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') return dp[i][j]=helper(s,p,i+1,j+1,dp);
    //     if(p.charAt(j)=='*') return dp[i][j]=helper(s,p,i+1,j+1,dp) || helper(s,p,i+1,j,dp) || helper(s,p,i,j+1,dp);
    //     return dp[i][j]=false;
    // }

    // dp tabulation

    public boolean isMatch(String s, String p){
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[m][n] = true;
        for(int j=n-1; j>=0; j--){
            if(p.charAt(j)=='*') dp[m][j] = dp[m][j+1];
            else break;
        }
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(p.charAt(j)==s.charAt(i) || p.charAt(j)=='?') dp[i][j] = dp[i+1][j+1];
                else if(p.charAt(j)=='*'){
                    dp[i][j] = dp[i][j+1] || dp[i+1][j];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[0][0];
    }
}