class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                stk.push(stk.pop()+stk.pop());
            }
            else if(s.equals("-")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b-a);
            }
            else if(s.equals("*")){
                stk.push(stk.pop()*stk.pop());
            }
            else if(s.equals("/")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b/a);
            }
            else{
                stk.add(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}