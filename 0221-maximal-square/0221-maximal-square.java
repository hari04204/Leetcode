class Solution {
    // public int maximalSquare(char[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int max = 0;
    //     for(int i=0; i<m; i++){
    //         for(int j = 0; j<n; j++){
    //             if(matrix[i][j]=='1'){
    //                 for(int a=0; a+i<m && a+j<n; a++){
    //                     if(allOnes(matrix,i,j,a)){
    //                         max=Math.max(max,(a+1)*(a+1));
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return max;
    // }
    // public boolean allOnes(char[][] mat, int i, int j, int a){
    //     for(int x=i; x<=i+a; x++){
    //         for(int y=j; y<=j+a; y++){
    //             if(mat[x][y]=='0') return false;
    //         }
    //     }
    //     return true;
    // }
    public int maximalSquare(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]dp = new int[m][n];
        int max = 0;
        for(int i=0; i<m; i++){
            dp[i][0]= matrix[i][0]=='1'?1:0;
            max = Math.max(dp[i][0],max);
        }
        for(int i=0; i<n; i++){
            dp[0][i]= matrix[0][i]=='1'?1:0;
            max = Math.max(dp[0][i],max);
        }
        for(int i=1;i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]=='0')dp[i][j]=0;
                else {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max*max;
    }
}