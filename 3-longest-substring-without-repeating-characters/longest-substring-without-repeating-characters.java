class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==1) return 1;
        int left = 0;
        int right = 0;
        int count = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        while(right<n){
            if(set.contains(s.charAt(right))){
                set.clear();
                count = 0;
                left++;
                right = left;
            }
            else{
                set.add(s.charAt(right));
                right++;
                count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}