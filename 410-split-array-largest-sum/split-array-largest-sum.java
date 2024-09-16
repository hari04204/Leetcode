class Solution {
    public int splitArray(int[] nums, int k) {
        // max element in nums
        int start = 0;
        // sum of all elements in array
        int end = 0;
        for(int i: nums){
            start = Math.max(start,i);
            end += i;
        }
        // binary search
        while(start<end){
            // try mid as potential ans
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(num + sum > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}