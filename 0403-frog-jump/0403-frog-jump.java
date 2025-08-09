class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (n > 1 && stones[1] != 1) return false;
        Boolean[][] dp = new Boolean[n][n + 1];
        return dfs(0, 0, stones, dp);
    }

    private boolean dfs(int index, int lastJump, int[] stones, Boolean[][] dp) {
        if (index == stones.length - 1) return true;
        if (dp[index][lastJump] != null) return dp[index][lastJump];

        for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {
            if (jump > 0) {
                int nextPos = stones[index] + jump;
                for (int nextIndex = index + 1; nextIndex < stones.length; nextIndex++) {
                    if (stones[nextIndex] == nextPos) {
                        if (dfs(nextIndex, jump, stones, dp)) {
                            return dp[index][lastJump] = true;
                        }
                        break; // found the stone; no need to keep scanning further
                    }
                    if (stones[nextIndex] > nextPos) break; // no match possible past this point
                }
            }
        }

        return dp[index][lastJump] = false;
    }
}
