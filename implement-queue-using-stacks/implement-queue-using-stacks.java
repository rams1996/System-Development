class MyQueue {
​
    //Stack is LIFO and queue is FIFO.
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!s2.isEmpty())
            return s2.pop();
        else
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            
            return s2.pop();
        }
    }
    
    /** Get the front element. */
    public int peek() {
