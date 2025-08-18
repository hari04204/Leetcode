class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n==0 || s.charAt(0)=='0') return 0;
        int[] dp = new int[n+1];
        dp[n] =1;
        if(s.charAt(n-1)!='0')dp[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            if(s.charAt(i)=='0'){
                dp[i] = 0;
            }else{
                dp[i] = dp[i+1];
                int td = Integer.parseInt(s.substring(i,i+2));
                if(td>=10 && td<=26){
                    dp[i] += dp[i+2];
                }
            }
        }
        return dp[0];
    }
}