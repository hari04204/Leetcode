class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        if(m*n!=original.length) return new int[][]{};
        int k = 0;
        int i = 0;
        int j = 0;
        while(k<original.length || (i<m && j<n)){
            System.out.println(i+" "+j+" "+k);
            res[i][j] = original[k];
            k++;
            j++;
            if(j==n){
                if(i!=m){
                    i++;
                    j=0;
                }
                else{
                    break;
                }
            }
            if(i==m){
                break;
            }
            
        }
        return res;
    }
}