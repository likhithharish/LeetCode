/*
- Use a arraylist to store prev values and count indexes that are kept in arraylist.
- For each index 1) if stack is not empty, remove all the elem from stack (from top) that are <= to it.
- 2) if stack is empty , compute span .
- compute span - (stack is empty) = (count +1) . count is index of elem in arraylist.
- else (count - stack.peek()) . index of elem - index of previous greatest.
*/
class StockSpanner {
    private ArrayList<Integer> arr;
    private Stack<Integer> s;
    private int count;
    public StockSpanner() {
        s = new Stack<Integer>();
        arr = new ArrayList<Integer>();
        count = -1;
    }
    
    public int next(int price) {
        arr.add(price);
        count+=1;
        while(!s.isEmpty() && arr.get(s.peek()) <= price){
            s.pop();
        }
        
        int span = (s.isEmpty()) ? (count+1) : (count - s.peek());
        s.push(count);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */