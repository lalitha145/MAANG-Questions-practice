class MyStack {
    Stack<Integer> s=new Stack<>();
    Queue<Integer> q=new LinkedList<>();


    public MyStack() {


        
    }
    
    public void push(int x) {
        s.push(x);        
    }
    
    public int pop() {
        return s.pop();
        
    }
    
    public int top() {
        return s.peek();

        
    }
    
    public boolean empty() {
        return s.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */