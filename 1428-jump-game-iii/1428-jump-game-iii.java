class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return helper(start, arr, visited);
    }
    public boolean helper(int i, int[] arr, boolean[] visited){
        if(i>=arr.length || i<0 || visited[i]==true) return false;
        if(arr[i]==0)return true;
        visited[i]=true;
        return helper(i+arr[i], arr, visited) || helper(i-arr[i], arr, visited);
    }
}