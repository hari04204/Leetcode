class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int unrot = 0;
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    unrot++;
                }
            }
        }
        if(unrot==0) return 0;
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair p = q.poll();
                int x = p.x;
                int y = p.y;
                if(y>0 && grid[x][y-1]==1){
                    grid[x][y-1]=2;
                    q.add(new Pair(x,y-1));
                    unrot--;
                }
                if(y<grid[0].length-1 && grid[x][y+1]==1){
                    grid[x][y+1]=2;
                    q.add(new Pair(x,y+1));
                    unrot--;
                }
                if(x<grid.length-1 && grid[x+1][y]==1){
                    grid[x+1][y]=2;
                    q.add(new Pair(x+1,y));
                    unrot--;
                }
                if(x>0 && grid[x-1][y]==1){
                    grid[x-1][y]=2;
                    q.add(new Pair(x-1,y));
                    unrot--;
                } 
            }
            if(!q.isEmpty())time++;
        }
        if(unrot==0) return time;
        return -1;
    }
    public class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}