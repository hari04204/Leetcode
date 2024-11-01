class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,word,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        visited[i][j] = true;
        boolean ans = false;
        if(index == word.length()-1){
            ans = true;
        }
        if(ans!=true && i<board.length-1 && word.charAt(index+1)==board[i+1][j] && !visited[i+1][j]){
            ans = dfs(board, i+1, j, word, index+1,visited);
        }
        if(ans!=true && j<board[0].length-1 && word.charAt(index+1)==board[i][j+1] && !visited[i][j+1]){
            ans = dfs(board, i, j+1, word, index+1,visited);
        }
        if(ans!=true && i>0 && word.charAt(index+1)==board[i-1][j] && !visited[i-1][j]){
            ans = dfs(board, i-1, j, word, index+1,visited);
        }
        if(ans!=true && j>0 && word.charAt(index+1)==board[i][j-1] && !visited[i][j-1]){
            ans = dfs(board, i, j-1, word, index+1,visited);
        }
        visited[i][j] = false;
        return ans;
    }
}