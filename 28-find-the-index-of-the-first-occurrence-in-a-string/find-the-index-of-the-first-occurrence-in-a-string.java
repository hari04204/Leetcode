class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++){
            int j = 0;
            while(j < m){
                if(haystack.charAt(i+j)!= needle.charAt(j)){
                    break;
                }
                j++;
                if(j == m){
                    return i;
                }
            }
        }
        return -1;
    }
}