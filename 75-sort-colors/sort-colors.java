class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i: nums){
            if(i==0)c0++;
            if(i==1)c1++;
            if(i==2)c2++;
        }
        for(int i = 0;i<nums.length;i++){
            if(c0>0){
                nums[i]=0;
                c0--;
                continue;
            }
            if(c1>0){
                c1--;
                nums[i]=1;
                continue;
            }
            if(c2>0){
                c2--;
                nums[i]=2;
            }
        }
    }
}