class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (n > 1 && stones[1] != 1) return false; // first jump must be 1

        // Map stone position to index
        Map<Integer, Integer> posToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            posToIndex.put(stones[i], i);
        }

        // Memoization: dp[index][lastJump]
        Boolean[][] dp = new Boolean[n][n + 1];
        return dfs(0, 0, stones, posToIndex, dp);
    }

    private boolean dfs(int index, int lastJump, int[] stones,
                        Map<Integer, Integer> posToIndex, Boolean[][] dp) {
        if (index == stones.length - 1) return true;
        if (dp[index][lastJump] != null) return dp[index][lastJump];

        for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {
            if (jump > 0) {
                int nextPos = stones[index] + jump;
                if (posToIndex.containsKey(nextPos)) {
                    int nextIndex = posToIndex.get(nextPos);
                    if (dfs(nextIndex, jump, stones, posToIndex, dp)) {
                        return dp[index][lastJump] = true;
                    }
                }
            }
        }
        return dp[index][lastJump] = false;
    }
}
