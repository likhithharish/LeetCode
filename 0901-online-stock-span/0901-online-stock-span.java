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