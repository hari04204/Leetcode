class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int i = 0;
        while(i<k){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }
        ans[0] = nums[dq.getFirst()];
        while(i<n){
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