class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] hasQueen = new boolean[8][8];
        for(int[] q: queens) hasQueen[q[0]][q[1]] = true;
        for(int i = 0; i<8; i++){
            int x = king[0]+dx[i];
            int y = king[1]+dy[i];
            while(x>=0 && x<8 && y>=0 && y<8){
                if(hasQueen[x][y]){
                    ans.add(Arrays.asList(x,y));
                    break;
                }
                x+=dx[i];
                y+=dy[i];
            }
        }
        return ans;
    }
}