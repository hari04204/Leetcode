class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };
        Set<String> obs = new HashSet<>();
        for (int[] row : obstacles) {
            obs.add(row[0] + "," + row[1]);
        }
        int dist = 0;
        int dir = 0;
        // 0 -> north || 1 -> east || 2 -> south || 3-> west
        for (int i : commands) {
            if (i == -2) {
                if (dir > 0) {
                    dir--;
                } else
                    dir = 3;
            } else if (i == -1) {
                if (dir < 3)
                    dir++;
                else
                    dir = 0;
            } else {
                while (i-- > 0) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    if (obs.contains(nx + "," + ny))
                        break;
                    x = nx;
                    y = ny;
                }
            }
            dist = Math.max(x*x+y*y, dist);

        }
        return dist;
    }
}