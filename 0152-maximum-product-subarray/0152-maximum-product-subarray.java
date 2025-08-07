class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int front = 1;
        int back = 1;
        for(int i = 0; i<nums.length; i++){
            front = front*nums[i];
            back = back*nums[nums.length-1-i];
            ans = Math.max(ans, Math.max(front,back));
            if(nums[i]==0)front=1;
            if(nums[nums.length-i-1]==0)back=1;
        }
        return ans;
    }
}