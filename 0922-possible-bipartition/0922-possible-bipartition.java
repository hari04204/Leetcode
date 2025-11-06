class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e: dislikes){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        int[] color = new int[n+1];

        for(int i=1; i<=n; i++){
            if(color[i]==0){
                if(!dfs(adj,color,i,1)) return false;
            }
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj, int[] color, int node, int c){
        color[node]=c;
        for(int n: adj.get(node)){
            if(color[n]==c){
                return false;
            }
            if(color[n]==0 && !dfs(adj,color,n,-c)) return false;
        }
        return true;
    }
}