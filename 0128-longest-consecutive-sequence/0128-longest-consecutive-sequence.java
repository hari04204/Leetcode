class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }
        int count = 0;
        for(int i: nums){
            if(!set.contains(i-1)){
                int length = 1;
                while(set.contains(i+length)) length++;
                count = Math.max(count, length);
            }
        }
        return count;
    }
}