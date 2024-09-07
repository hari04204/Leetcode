class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        for(int i = 0; i < Math.min(strs[0].length(),strs[strs.length-1].length()); i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                return ans;
            }
            ans += strs[0].charAt(i);
        }
        return ans;
    }
}