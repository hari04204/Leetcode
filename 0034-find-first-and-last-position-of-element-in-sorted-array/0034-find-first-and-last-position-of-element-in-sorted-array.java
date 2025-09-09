class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else r=mid-1;
        }
        if(l>=nums.length || nums[l]!=target) return new int[]{-1,-1};
        int i=l;
        r = nums.length-1;
        while(i<=r){
            int mid=(i+r)/2;
            if(nums[mid]>target){
                r = mid-1;
            }
            else i=mid+1;
        }
        return new int[]{l,r};
    }
}