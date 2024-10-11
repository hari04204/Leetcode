class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int a,b;
        for(int i = 0; i < tokens.length; i++){
            switch(tokens[i]){
                case "+": 
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(a+b);
                    break;
                case "-":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b-a);
                    break;
                case "*":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b*a);
                    break;
                case "/":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b/a);
                    break;
                default:
                    stk.push(Integer.valueOf(tokens[i]));
                    break;
            }
        }
        return stk.peek();
    }
}