class Solution {
    public int maximumCount(int[] nums) {
        int p = 0, n = 0;
        for(int x: nums){
            if(x>0)p++;
            if(x<0)n++;
        }
        return Math.max(p,n);
    }
}