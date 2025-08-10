class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        boolean[][] visited = new boolean[n][n];
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int pathlen = 1;
        visited[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        while (!q.isEmpty()) {
            int s = q.size();
            for (int j = 0; j < s; j++) {
                int[] pair = q.poll();
                int x = pair[0];
                int y = pair[1];
                if (x == n - 1 && y == n - 1)
                    return pathlen;
                for (int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] != 1) {
                        visited[nx][ny] = true;
                        q.add(new int[] { nx, ny });
                    }
                }
            }
            pathlen++;
        }
        return -1;
    }
}