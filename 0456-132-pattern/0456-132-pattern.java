class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack();
        int[] minarr = new int[n];
        minarr[0] = nums[0];
        for(int i = 1; i<n; i++){
            minarr[i] = Math.min(minarr[i-1],nums[i]);
        }
        for(int i = n-1; i>=0; i--){
            if(nums[i] > minarr[i]){
                while(!stk.isEmpty() && stk.peek()<=minarr[i]){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek()<nums[i]){
                    return true;
                }
                stk.push(nums[i]);
            }
        }
        return false;
    }
}
