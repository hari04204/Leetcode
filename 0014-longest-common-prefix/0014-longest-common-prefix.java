class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder("");
        int n = strs[0].length();
        int i = 0;
        while(i<n){
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0];
    }
}