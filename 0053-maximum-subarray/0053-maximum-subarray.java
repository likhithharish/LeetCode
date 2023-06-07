class Solution {
    /*Intuition:
    - keep track of tempsum and if it becomes <0 , make it 0 and start counting new subarray sum. Update res whenever tempSum > prev res.
    */
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            res = Math.max(res, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return res;
    }
}