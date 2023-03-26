class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = -1;
        for( int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min( prices[i], min );
            
        }
        return (maxProfit==-1) ? 0 : maxProfit;
    }
}