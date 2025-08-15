class MinStack {
    Stack<Integer> one;
    Stack<Integer> two;
    int min;
    public MinStack() {
        one = new Stack<>();
        two = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(val,min);
        one.push(val);
    }
    
    public void pop() {
        one.pop();
        min = Integer.MAX_VALUE;
        while(!one.isEmpty()){
            int x = one.pop();
            two.push(x);
            min = Math.min(min,x);
        }
        while(!two.isEmpty()){
            one.push(two.pop());
        }
    }
    
    public int top() {
        return one.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */