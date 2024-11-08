class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int max =(int) Math.pow(2,maximumBit)-1;
        int[] ans = new int[n];
        int curr = 0;
        for(int i = 0; i<nums.length; i++){
            curr = curr^nums[i];
            ans[n-1-i] = curr^max;
        }
        return ans;
    }
}