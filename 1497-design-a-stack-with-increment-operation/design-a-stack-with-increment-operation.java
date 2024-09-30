class CustomStack {
    int[] stk;
    int top = -1;
    public CustomStack(int maxSize) {
        this.stk = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int x) {
        if(this.top+1 == this.stk.length) return;
        this.top++;
        this.stk[top] = x;
    }
    
    public int pop() {
        if(this.top == -1){
            return this.top;
        }
        int temp = this.stk[this.top];
        this.top--;
        return temp;
    }
    
    public void increment(int k, int val) {
        for(int i = 0;i<Math.min(top+1,k);i++){
            this.stk[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */