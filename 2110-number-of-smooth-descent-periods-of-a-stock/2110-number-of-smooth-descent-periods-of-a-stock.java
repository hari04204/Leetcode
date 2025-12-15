class Solution {
    public long getDescentPeriods(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        long ans = 1;
        long curr = 1;
        for(int i=1; i<n; i++){
            if(nums[i-1]-nums[i]==1){
                curr++;
            }
            else{
                curr=1;
            }
            ans+=curr;
        }
        return ans;
    }
}