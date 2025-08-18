class Solution {
    public int smallestRangeII(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int res = nums[nums.length-1]-nums[0];
        for(int i = 0; i<nums.length-1; i++){
            int max = Math.max(nums[nums.length-1]-k,nums[i]+k);
            int min = Math.min(nums[0]+k,nums[i+1]-k);
            res = Math.min(res,max-min);
        }
        return res;
    }
}