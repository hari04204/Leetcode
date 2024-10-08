class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int b = -1;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                b = i;
                break;
            }
        }
        if(b==-1){
            reverse(nums,0,n-1);
            return;
        } 
        for(int i=n-1;i>b;i--){
            if(nums[i]>nums[b]){
                int temp = nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                break;
            }
        }
        reverse(nums,b+1,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}