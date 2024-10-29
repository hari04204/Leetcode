class Solution {
    public int maxMoves(int[][] grid) {
        int max = 0;
        int[][] memo = new int[grid.length][grid[0].length];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        for(int i = 0; i<grid.length; i++){
            int ans = move(grid,i,0,memo);
            max = Math.max(max,ans);
        }
        return max;
    }
    public int move(int[][] grid, int i, int j,int[][] memo){
        if(j == grid[0].length - 1){
            return 0;
        }
        if(memo[i][j] != -1) return memo[i][j];
        int max = 0;
        if(i != 0 && grid[i-1][j+1]>grid[i][j]){
            max = Math.max(max,1+move(grid,i-1,j+1,memo));
        }
        if(grid[i][j+1]>grid[i][j]){
            max = Math.max(max,1+move(grid,i,j+1,memo));
        }
        if(i < grid.length-1 && grid[i+1][j+1]>grid[i][j]){
            max = Math.max(max,1+move(grid,i+1,j+1,memo));
        }
        memo[i][j] = max;
        return max;
    }
}