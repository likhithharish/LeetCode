class MinStack {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> auxSt= new Stack<>();
    
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        
        st.push(val);
        if(auxSt.isEmpty() || auxSt.peek() >= st.peek()){
            auxSt.push(val);
        }
    }
    
    public void pop() {
        
        if(auxSt.peek().equals(st.peek())){
            auxSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        
        return st.peek();
    }
    
    public int getMin() {
        return auxSt.peek();
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