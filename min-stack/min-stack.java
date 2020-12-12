class MinStack {
​
    /** initialize your data structure here. */
    
    private int min;
    private Stack<Integer> stack;
    public MinStack() {
        
        this.min = Integer.MAX_VALUE;
        this.stack = new Stack<>();
        
    }
    public void push(int x) {
        
        if(x<=min)
        {
            //Push the existing min value;
            stack.push(min);
            //Update the new min value;
            min = x;
        }
        stack.push(x);   
    }
    public void pop() {
        
        //Check if the top is the min value;
        //If no simply pop
        //else pop the top value and the pop the next element which was the pevious min value;
        
        //poping the value.
        int val = stack.pop();
        if(val==min)
        {
            //update the min value and pop it
            min = stack.pop();
        } 
    }
    public int top() {  
        return stack.peek();   
    }
    
    public int getMin() { 
        return min;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
