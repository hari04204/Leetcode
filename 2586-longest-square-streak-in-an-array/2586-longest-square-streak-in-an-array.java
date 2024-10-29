class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Map<Integer, Integer> memo = new HashMap<>();
        int max = -1;
        for (int i : nums) {
            int streak = recur(i, set, memo);
            if (streak > 1) {
                max = Math.max(max, streak);
            }
        }
        return max;
    }
    private int recur(int i, Set<Integer> set, Map<Integer, Integer> memo) {
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int length = 1;
        if (i > 0 && i <= Math.sqrt(Integer.MAX_VALUE) && set.contains(i * i)) {
            length += recur(i * i, set, memo);
        }
        memo.put(i, length);
        return length;
    }
}
