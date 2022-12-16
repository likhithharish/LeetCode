class Solution {
    public int maxProfit(int[] prices) {
        // find local minimum and update it when we traverse into min
        // when we find a maximum value which diff with min local is greater than current maxprofit ; update maxprofit with diff.
        int min = Integer.MAX_VALUE;
        int max = 0;
        for( int i=0;i<prices.length;i++){
            if(prices[i]< min){
                min = prices[i];
            }else if(prices[i]-min>max){
                max = prices[i]-min;
            }
        }
        
        return max;
    }
}