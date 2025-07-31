class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);
        for(int i = n-1; i>=0; i--){
            for(int j = i+1; j<n; j++){
                if(nums[i]<nums[j]){
                    lis[i] = Math.max(lis[i], lis[j]+1);
                }
            }
        }
        int max = 0;
        for(int i: lis){
            max = Math.max(max,i);
        }
        return max;
    }
}