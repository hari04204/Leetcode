class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        int[][] grid2 = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                grid2[j][i] = grid[i][j];
            }
        }
        for(int[] i: grid){
            loop:for(int[] j: grid2){
                for(int k = 0; k<n; k++){
                    if(i[k]!=j[k]){
                        continue loop;
                    }
                }
                count++;
            }
        }
        return count;
    }
}