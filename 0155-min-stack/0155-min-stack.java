class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
    }
}
class MinStack {
    private Node head;
    private int size;
    
    
    public MinStack() {
        head = null;
        size =0;
        
    }
    
    public void push(int val) {
        Node temp = new Node(val);
        if(head == null){
            head = temp;
           
            size+=1 ;
            return;
        }
        temp.next = head;
        head = temp;
        size +=1 ;
        
    }
    
    public void pop() {
        
        Node next = head.next;
        head.next = null;
        head = next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
       int min = Integer.MAX_VALUE;
        Node curr = head;
        while(curr != null){
            min = Math.min(min, curr.data);
            curr = curr.next;
        }
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