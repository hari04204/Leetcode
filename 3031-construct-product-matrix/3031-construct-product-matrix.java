class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        int[] pre = new int[m * n];
        int[] suf = new int[m * n];
        int[] flat = new int[m * n];
        int idx = 0;
        int MOD = 12345;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flat[idx++] = grid[i][j];
            }
        }
        pre[0] = 1;
        for (int i = 1; i < m * n; i++) {
            pre[i] = (int)(((long) pre[i - 1] * flat[i - 1]) % MOD);
        }
        suf[m * n - 1] = 1;
        for (int i = m * n - 2; i >= 0; i--) {
            suf[i] = (int)(((long) suf[i + 1] * flat[i + 1]) % MOD);
        }
        idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = (int)(((long) pre[idx] * suf[idx]) % MOD);
                idx++;
            }
        }
        return ans;
    }
}
