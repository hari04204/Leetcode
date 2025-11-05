class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int scolor = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[image.length][image[0].length];
        int[] dirx = {-1,0,1,0};
        int[] diry = {0,1,0,-1};
        q.add(new int[]{sr,sc});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                visited[x][y] = true;
                image[x][y] = color;
                for(int j=0; j<4; j++){
                    int newx = x+dirx[j];
                    int newy = y+diry[j];
                    if(newx>=0 && newx<image.length && newy>=0 && newy<image[0].length && image[newx][newy]==scolor && !visited[newx][newy]){
                        q.add(new int[]{newx,newy});
                    }
                }
            }
        }
        return image;
    }
}