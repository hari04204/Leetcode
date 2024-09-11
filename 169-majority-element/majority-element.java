class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current;
        int candidate = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count++;
            }
            else if(nums[i]==candidate){
                count++;
            }
            else if(nums[i]!=candidate){
                count--;
            }
        }
        return candidate;
    }
}