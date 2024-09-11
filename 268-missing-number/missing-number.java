class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int sum2 = 0;
        for(int i=0; i<n+1;i++){
            sum2+=i;
        }
        return sum2-sum;
    }
}