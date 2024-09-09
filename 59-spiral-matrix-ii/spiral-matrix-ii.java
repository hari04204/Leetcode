class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int l = 0;
        int t = 0;
        int r = matrix[0].length;
        int b = matrix.length;
        int i = 0;
        int count = 1;
        while(l<r&&t<b){
            for(i=l;i<r;i++){
                matrix[t][i]=count;
                count++;
            }
            t++;
            for(i=t;i<b;i++){
                matrix[i][r-1]=count;
                count++;
            }
            r--;
            if(!(l<r&&t<b)){
                break;
            }
            for(i=r-1;i>l-1;i--){
                matrix[b-1][i]=count;
                count++;
            }
            b--;
            for(i=b-1;i>=t;i--){
                matrix[i][l]=count;
                count++;
            }
            l++;
        
        }
        return matrix;
    }
}