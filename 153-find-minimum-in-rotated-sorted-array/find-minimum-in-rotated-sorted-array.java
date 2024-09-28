class Solution {
    public int findMin(int[] nums) {
        // int start = 0;
        // int end = nums.length - 1;
        // int min = Integer.MAX_VALUE;
        // while(start<end){
        //     int mid = (start+end)/2;
        //     if(nums[mid]>nums[end]){
        //         start = mid+1;
        //     }
        //     else{
        //         end = mid;
        //     }
        // }
        // return nums[start];
        return search(nums, 0, nums.length-1);
    }
    public int search(int[] nums, int s, int e){
        if(s>=e) return nums[s];
        int m = (s+e)/2;
        if(nums[m]>nums[e]) return search(nums,m+1,e);
        return search(nums,s,m);
    }
}