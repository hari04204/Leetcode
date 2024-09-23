class Solution {
    public boolean isMonotonic(int[] nums) {
        if(incOrDec(1,nums)) return incOrDec(1,nums);
        else return incOrDec(-1,nums);
    }
    public boolean incOrDec(int inc, int[] nums){
        if(inc==1){
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        else{
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
            return true;
        }
    }
}