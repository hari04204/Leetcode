class Solution {
    // public String longestPalindrome(String s) {
    //     if (s == null || s.length() == 0) {
    //         return "";
    //     }

    //     int start = 0;
    //     int end = 0;

    //     for (int i = 0; i < s.length(); i++) {
    //         int odd = expandAroundCenter(s, i, i);
    //         int even = expandAroundCenter(s, i, i + 1);
    //         int max_len = Math.max(odd, even);

    //         if (max_len > end - start) {
    //             start = i - (max_len - 1) / 2;
    //             end = i + max_len / 2;
    //         }
    //     }

    //     return s.substring(start, end + 1);        
    // }

    // private int expandAroundCenter(String s, int left, int right) {
    //     while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    //         left--;
    //         right++;
    //     }
    //     return right - left - 1;
    // }
    public String longestPalindrome(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxlen = 1;
        for(int i=0; i<n; i++){
            dp[i][i]=true;
        }
        for(int i=0;i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start = i;
                maxlen = 2;
            }
        }
        for(int len = 3; len<=n; len++){
            for(int i = 0;i<=n-len; i++){
                int j = i+len-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    if(len>maxlen){
                        start=i;
                        maxlen = len;
                    }
                }
            }
        }
        return s.substring(start,start+maxlen);
    }    
}