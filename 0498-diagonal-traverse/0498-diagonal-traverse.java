class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int idx = 0;
        int i = 0;
        int j = 0;
        int flag = 1;
        while(true){
            if(flag==1 && i<0 && j==n){
                i+=2;
                j=n-1;
                flag = -1;
            }
            else if(flag == -1 && j<0 && i==m){
                i=m-1;
                j+=2;
                flag = 1;
            }
            else if(flag==1 && i<0){
                i=0;
                flag=-1;
            }
            else if(flag==-1 && j<0){
                j=0;
                flag = 1;
            }
            else if(flag==1 && j==n){
                j=n-1;
                i+=2;
                flag=-1;
            }
            else if(flag==-1 && i==m){
                i=m-1;
                j+=2;
                flag = 1;
            }
            ans[idx++] = mat[i][j];
            if(i==m-1 && j==n-1) break;
            if(flag==1){
                i--;
                j++;
            }
            else{
                i++;
                j--;
            }
        }
        return ans;
    }
}