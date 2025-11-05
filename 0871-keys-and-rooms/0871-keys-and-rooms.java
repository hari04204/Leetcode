class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms,visited,0);
        for(boolean b: visited){
            if(b!=true){
                return b;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, boolean[] visited, int i){
        if(visited[i]){
            return;
        }
        visited[i]=true;
        for(int x:rooms.get(i)){
            dfs(rooms,visited,x);
        }
    }
}