class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){ 
                stk.push(i);
            }
            else{
                stk.pop();
                if(!stk.isEmpty()){
                    max = Math.max(max,i-stk.peek());
                }
                else{
                    stk.push(i);
                }
            }
        }
        return max;
    }
}