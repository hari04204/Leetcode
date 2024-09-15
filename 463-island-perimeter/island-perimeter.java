class Solution {
    public int islandPerimeter(int[][] grid) {
        //check right
        int m = grid.length;
        int n = grid[0].length;
        int per = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int x = grid[i][j];
                
                if(x==1){
                    if(j == 0) per++;
                    else if(grid[i][j-1] == 0) per++;
                    if(j == n-1) per++;
                    else if(grid[i][j+1] == 0) per++;
                    //check left
                    
                    //check right
                    //check top
                    if(i == 0) per++;
                    else if(grid[i-1][j] == 0) per++;
                    if(i == m-1) per++;
                    else if(grid[i+1][j] == 0) per++;
                } 
                //check left
                //check top
                //check bottom
            }
        }
        return per;

    }
}