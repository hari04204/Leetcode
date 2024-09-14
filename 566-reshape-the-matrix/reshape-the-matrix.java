class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if(mat[0].length*mat.length != r*c) return mat;
        int rc = 0;
        int cc = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
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