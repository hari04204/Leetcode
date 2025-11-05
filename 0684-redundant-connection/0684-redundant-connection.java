class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];
        for(int i=1; i<=n; i++){
            parent[i] = i;
            rank[i] = 1;
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            if(!union(u,v,parent,rank)){
                return edge;
            }
        }
        return new int[0];
    }
    public boolean union(int x, int y, int[] parent, int[] rank){
        int rootx = find(x,parent);
        int rooty = find(y,parent);

        if(rootx == rooty) return false;

        if(rank[rootx]>rank[y]){
            parent[rooty]=rootx;
        }
        else if(rank[rooty]>rank[rootx]){
            parent[rootx]=rooty;
        }
        else{
            parent[rooty] = rootx;
            rank[rootx]++;
        }
        return true;
    }
    public int find(int x, int[] parent){
        if(x!=parent[x]){
            parent[x] = find(parent[x],parent);
        }
        return parent[x];
    }
}