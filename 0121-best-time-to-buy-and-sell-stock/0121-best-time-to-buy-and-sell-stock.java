class Solution {
    /*
    Intuition:
    - Need to find minimum stock day and highest stock after that.
    - Loop through and update minStock and also maxProfit.
    */
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int currMin = prices[0];
        for( int i=0; i< prices.length; i++){
            currMin = Math.min(currMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - currMin);
            
        }
        return maxProfit;
    }
}