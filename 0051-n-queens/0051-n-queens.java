class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] b = new char[n][n];
        for(char[] c: b){
            Arrays.fill(c,'.');
        }
        solve(res,n,0,b);
        return res;
    }
    public void solve(List<List<String>> res, int n, int row, char[][] b){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(char[] c: b){
                temp.add(new String(c));
            }
            res.add(temp);
            return;
        }
        for(int i=0; i<n; i++){
            if(canPlace(row,i,b)){
                b[row][i]='Q';
                solve(res,n,row+1,b);
                b[row][i]='.';
            }
        }
    }
    public boolean canPlace(int row, int col,char[][] b){
        for(int i=0; i<row; i++){
            if(b[i][col]=='Q') return false;
        }
        for(int i=row-1 , j = col-1; i>=0 && j>=0; i--,j--){
            if(b[i][j]=='Q') return false;
        }
        for(int i=row-1 , j = col+1; i>=0 && j<b.length; i--,j++){
            if(b[i][j]=='Q') return false;
        }
        return true;
    }
}