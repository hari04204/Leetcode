class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }
            map.put(c,i);
            max = Math.max(i-left+1,max);
        }
        return max;
    }
}