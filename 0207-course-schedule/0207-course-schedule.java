class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<Integer>[] adj = new List[n];
        int[] indeg = new int[n];
        List<Integer> ans = new ArrayList<>();

        for(int[] pair : prerequisites){
            if(adj[pair[1]]==null){
                adj[pair[1]] = new ArrayList<>();
            }
            adj[pair[1]].add(pair[0]);
            indeg[pair[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            if(indeg[i]==0)q.add(i);
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            if(adj[curr]!=null){
                for(int next: adj[curr]){
                    indeg[next]--;
                    if(indeg[next]==0){
                        q.add(next);
                    }
                }
            }
        }
        return ans.size()==n;
    }
}