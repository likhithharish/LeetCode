class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int currMin = prices[0];
        for( int i=0; i< prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - currMin);
            currMin = Math.min(currMin, prices[i]);
        }
        return maxProfit;
    }
}