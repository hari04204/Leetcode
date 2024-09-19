class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
            if(sum-nums[i]==rightSum(nums,i)){
                return i;
            }

        }
        return -1;
    }
    public int rightSum(int[] nums, int index){
        int sum = 0;
        for(int i = index+1; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}