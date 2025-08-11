class Solution {
    public int numSquares(int n) {
        List<Integer> ps = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            ps.add(i*i);
        }
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return helper(n,ps,memo);
    }
    public int helper(int n, List<Integer> ps, int[] memo){
        if(n==0) return 0;
        if(memo[n]!=-1) return memo[n];
        int min = Integer.MAX_VALUE;
        for(int i:ps){
            if(i>n) break;
            min = Math.min(1+helper(n-i,ps,memo),min);
        }
        memo[n] = min;
        return min;
    }
}