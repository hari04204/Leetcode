class Solution {
    public static boolean isValidSudoku(char[][] board) {
        boolean[] f1 = new boolean[10];
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j]!='.' && f1[board[i][j]-'0']) return false;
                if(board[i][j]!='.') f1[board[i][j]-'0']=true;
            }
            f1=new boolean[10];
        }
        f1=new boolean[10];
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[j][i]!='.' && f1[board[j][i]-'0']) return false;
                if(board[j][i]!='.') f1[board[j][i]-'0']=true;
            }
            f1=new boolean[10];
        }
        boolean[] f2 = new boolean[10];
        boolean[] f3 = new boolean[10];
        for(int i=0; i<9; i++){
            if(i==3 || i==6){
                f1=new boolean[10];
                f2=new boolean[10];
                f3=new boolean[10];
            }
            for(int j=0; j<9; j++){
                if(j<3 && board[i][j]!='.'){
                    if(f1[board[i][j]-'0']) return false;
                    f1[board[i][j]-'0']=true;
                }
                else if(j<6 && board[i][j]!='.'){
                    if(f2[board[i][j]-'0']) return false;
                    f2[board[i][j]-'0']=true;
                }
                else if(j<9 && board[i][j]!='.'){
                    if(f3[board[i][j]-'0']) return false;
                    f3[board[i][j]-'0']=true;
                }
            }
        }
        return true;
    }
}