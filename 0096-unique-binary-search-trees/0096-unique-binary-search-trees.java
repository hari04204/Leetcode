class Solution {
    public int numTrees(int n) {
        if(n<=1) return n;
        int[] numTree = new int[n+1];
        numTree[0]=1;
        numTree[1]=1;
        for(int i=2; i<=n; i++){
            int sum=0;
            for(int j=1; j<i+1; j++){
                int l = j-1;
                int r = i-j;
                sum+= numTree[l]*numTree[r];
            }
            numTree[i]=sum;
        }
        return numTree[n];
    }
}