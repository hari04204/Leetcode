class Solution {
    public int numEnclaves(int[][] grid) {
        for(int i = 0; i<grid[0].length; i++){
            if(grid[0][i]==1) dfs(grid,0,i);
            if(grid[grid.length-1][i]==1) dfs(grid,grid.length-1,i);
        }
        for(int i = 0; i<grid.length; i++){
            if(grid[i][0]==1) dfs(grid,i,0);
            if(grid[i][grid[0].length-1]==1) dfs(grid,i,grid[0].length-1);
        }
        int ans = 0;
        for(var ele : grid) {
            for(var e : ele) {
                ans+=e;
            }
        }
        return ans;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return;
        grid[i][j]=0;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1); 
        dfs(grid,i,j+1); 
    }
}