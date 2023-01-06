class Solution {
    public int maxProfit(int[] prices) {
        /*Stack<Integer> stack = new Stack<>();
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            
            if (stack.isEmpty()) {
                stack.push(prices[i]);
                continue;
            }
            int top = stack.peek();
            if (stack.size() == 1 && top > prices[i]) {
                stack.pop();
                stack.push(prices[i]);
            } else if (prices[i] > top && stack.size() >= 1) {
                stack.push(prices[i]);
            } else if (stack.size() > 1 && prices[i] < top) {
                maxProfit += stack.peek() - stack.firstElement();
                stack.clear();
                stack.push(prices[i]);
            }
            
        }
        if (!stack.isEmpty() && stack.size() > 1) {
            maxProfit += stack.peek() - stack.firstElement();
        }

        return maxProfit;*/
        int profit = 0;
        for( int i=1;i< prices.length; i++){
            if( prices[i]> prices[i-1]){
                profit += prices[i]- prices[i-1];
            }
        }
         return profit;      
    }
               
}