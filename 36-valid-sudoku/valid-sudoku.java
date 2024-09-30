class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set1 = new HashSet<>();
        for(int i = 0; i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] != '.' && set1.add(board[i][j]) == false){
                    return false;
                }
            }
            set1.clear();
        }
        for(int i = 0; i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[j][i] != '.' && set1.add(board[j][i]) == false){
                    return false;
                }
            }
            set1.clear();
        }
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        for(int i = 0; i<9;i++){
            if(i==3||i==6) {
                set1.clear();
                set2.clear();
                set3.clear();
            }
            for(int j = 0;j<9;j++){
                if(j/3==0){
                    if(board[i][j] != '.' && set1.add(board[i][j]) == false){
                        return false;
                    }
                    continue;
                }
                if(j/3==1){
                    if(board[i][j] != '.' && set2.add(board[i][j]) == false){
                        return false;
                    }
                    continue;
                }
                if(j/3==2){
                    if(board[i][j] != '.' && set3.add(board[i][j]) == false){
                        return false;
                    }
                    continue;
                }
            }
        }
        return true;
    }
}