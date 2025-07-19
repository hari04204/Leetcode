class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = 0;
        while(l<nums.length-1 && nums[l]<=nums[l+1]){
            l++;
        }
        int r = nums.length-1;
        while(r>0 && nums[r-1]<=nums[r]){
            r--;
        }
        if(r<=l) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = l; i<r+1;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int i = 0;
        while(nums[i]<=min){
            i++;
        }
        l = i;
        i = nums.length-1;
        while(max<=nums[i]){
            i--;
        }
        r = i;
        System.out.println(l+" "+r);
        return r-l+1;
    }
}