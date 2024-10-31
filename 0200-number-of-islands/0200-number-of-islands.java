class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int i, int j, boolean[][] visited){
        visited[i][j] = true;
        //up
        if(i>0 && !visited[i-1][j] && grid[i-1][j]=='1'){
            dfs(grid,i-1,j,visited);
        }
        //down
        if(i<grid.length-1 && !visited[i+1][j] && grid[i+1][j]=='1'){
            dfs(grid,i+1,j,visited);
        }
        //left
        if(j>0 && !visited[i][j-1] && grid[i][j-1]=='1'){
            dfs(grid,i,j-1,visited);
        }
        //right
        if(j<grid[0].length-1 && !visited[i][j+1] && grid[i][j+1]=='1'){
            dfs(grid,i,j+1,visited);
        }
    }
}