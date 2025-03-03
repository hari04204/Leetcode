class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, eq = 0, g = 0;
        for(int i: nums){
            if(i<pivot) l++;
            else if(i>pivot) g++;
            else eq++;
        }
        int a = 0,b = l,c = l+eq;
        for(int i: nums){
            if(i<pivot){
                ans[a++]=i;
            }
            else if(i==pivot){
                ans[b++]=i;
            }
            else ans[c++]=i;
        }
        return ans;
    }
}