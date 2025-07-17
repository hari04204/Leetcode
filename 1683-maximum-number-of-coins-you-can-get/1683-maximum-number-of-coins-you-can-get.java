class Solution {
    public int maxCoins(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-2;
        int k = nums.length-1;
        int maxcoins = 0;
        while(i<j){
            maxcoins+=nums[j];
            i+=1;
            j-=2;
            k-=2;
        }
        return maxcoins;
    }
}