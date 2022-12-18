class Solution {
    public int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         int minDay = Integer.MAX_VALUE;
//         int maxDay =0;
        
//         for( int i=0;i< prices.length; i++){
//             if(prices[i]<minDay){
//                 minDay = prices[i];
//                 continue;
//             }
//             if(prices[i]>maxDay && maxDay>minDay){
//                 maxDay =prices[i];
//                 maxProfit += maxDay - minDay;
//                 System.out.println(maxProfit);
//                 maxDay = 0;
//                 minDay = Integer.MAX_VALUE;
//             }
//         }
//         return maxProfit;
        Stack<Integer> stack = new Stack<>();
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

        return maxProfit;
    }
}