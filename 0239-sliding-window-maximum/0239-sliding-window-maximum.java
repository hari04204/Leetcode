class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque();
        int i = 0;
        while(i<k){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }
        int[] ans = new int[nums.length-k+1];
        ans[0] = nums[dq.getFirst()];
        while(i<nums.length){
            while(!dq.isEmpty() && dq.getFirst()<i-k+1){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            ans[i-k+1]=nums[dq.getFirst()];
            i++;
        }
        return ans;
    }
}