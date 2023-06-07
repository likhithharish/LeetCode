class Solution {
    /* Intuition
    Basic : Consider each eleemnt as first elem and compute sum of all subarrays starting from it(maximum subarray prob). - TLE
    */
    public int maxSubarraySumCircular(int[] nums) {
        //NAIVE
        // int res = nums[0];
        // for (int i = 0; i < nums.length; i++) {
        //     int currSum = nums[i];
        //     int currMax = nums[i];
        //     for (int j = 1; j < nums.length; j++) {
        //         int index = (i + j) % (nums.length);
        //         currSum += nums[index];
        //         currMax = Math.max(currMax, currSum);
        //     }
        //     res = Math.max(currMax, res);
        // }
        // return res;
        int normalSum = normalSumSubArray(nums);
        if (normalSum < 0) {// All elements are negative
            return normalSum;
        }
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            nums[i] = -nums[i];
        } // Min Sum of normal subarray = max sum of inverse sub array
        int circularSum = currSum + normalSumSubArray(nums);
        return Math.max(normalSum, circularSum);
    }
    
    public static int normalSumSubArray(int[] nums) {
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