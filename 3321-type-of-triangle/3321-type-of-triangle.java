class Solution {
    public String triangleType(int[] nums) {
        if(nums[1]+nums[0]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            if(isEquilateral(nums)) return "equilateral";
            else if(isIsosceles(nums)) return "isosceles";
            else if(isScalene(nums)) return "scalene";
        }
        return "none";        
    }
    public boolean isEquilateral(int[] nums){
        int x = nums[0];
        for(int n: nums){
            if(n!=x) return false;
        }
        return true;
    }
    public boolean isIsosceles(int[] nums){
        if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]){
            return true;
        }
        return false;
    }
    public boolean isScalene(int[] nums){
        if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[2]!=nums[0]){
            return true;
        }
        return false;
    }
}