class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        
        if(m*n != r*c) return mat;
        int rc = 0;
        int cc = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                res[rc][cc] = mat[i][j];
                cc++;
                if(cc==c){
                    rc++;
                    cc = 0;
                }
            }
        }
        return res;
    }
}