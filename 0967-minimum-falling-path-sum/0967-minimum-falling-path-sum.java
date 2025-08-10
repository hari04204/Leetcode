class Solution {
    public int minFallingPathSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 1; i<m; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    mat[i][j] +=Math.min(mat[i-1][j],mat[i-1][j+1]);
                } 
                else if(j==n-1){
                    mat[i][j]+= Math.min(mat[i-1][j],mat[i-1][j-1]);
                }
                else{
                    mat[i][j]+=Math.min(mat[i-1][j-1],Math.min(mat[i-1][j],mat[i-1][j+1]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i: mat[m-1]){
            min=Math.min(min,i);
        }
        return min;
    }
}