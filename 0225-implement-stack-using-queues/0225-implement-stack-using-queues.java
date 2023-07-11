class MyStack {
    //Use a auxilary space queue q2 , whenever pushing, add it first to q2 and then add all elm of q1 to q2
    // after removing from q1.
    // swap q1 and q2
    
    Queue<Integer> q1, q2;
    private int size;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;// emptying q2 and adding all back to q1
        size++;
    }

    public int pop() {
        int res = q1.remove();
        size--;
        return res;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return (size == 0);
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