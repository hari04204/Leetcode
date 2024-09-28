class Solution {
    public int search(int[] nums, int target) {
        return searchRotatedArr(nums,0,nums.length-1,target);     
    }
    public static int searchRotatedArr(int[] nums, int s, int e, int target){
        if(s>e) return -1;
        int m = (e+s)/2;
        if(nums[m]==target) return m;
        if(nums[m]>=nums[s]){
            if(target >= nums[s] && target<=nums[m]){
                return searchRotatedArr(nums,s,m-1,target);
            }
            else{
                return searchRotatedArr(nums, m+1, e, target);
            }
        }
        else if(target>=nums[m] && target<=nums[e]){
            return searchRotatedArr(nums, m+1, e, target);
        }
        else return searchRotatedArr(nums, s, m-1, target);
    }
}