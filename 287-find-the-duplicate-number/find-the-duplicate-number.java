class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for(int i: nums){
            if(arr[i]==true){
                return i;
            }
            arr[i]=true;
        }
        return -1;
    }
}