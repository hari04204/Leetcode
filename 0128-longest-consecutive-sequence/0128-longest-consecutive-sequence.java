class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int max = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int num = i;
                int count = 1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}