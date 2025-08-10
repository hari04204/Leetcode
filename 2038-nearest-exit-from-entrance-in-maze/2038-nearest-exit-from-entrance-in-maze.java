class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,+1,0,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        boolean[][] visited = new boolean[m][n];
        visited[entrance[0]][entrance[1]] = true;
        int len = 0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0; i<s; i++){
                int[] pair = q.poll();
                int x = pair[0];
                int y = pair[1];
                if((x==0 || y==0 || x==m-1 || y==n-1) && !(x==entrance[0] && y== entrance[1])) return len;
                for(int k=0;k<4; k++){
                    int nx = x+dx[k];
                    int ny = y+dy[k];
                    if(nx>=0 && nx<m && ny>=0 && ny<n && maze[nx][ny]=='.' && !visited[nx][ny]){
                        visited[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            len++;
        }
        return -1;
    }
}