class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // NOrmal sum
        int maxNormal = kadaneAlgo(nums);
        if(maxNormal<0){ return maxNormal;}
        
        //Circular sum - Inverting array(+ to -)
        // Max sum of Inverted array = min sum of normal arr
        int arrSum =0;
        for( int i=0; i<nums.length; i++){
            arrSum += nums[i];
            nums[i] = -nums[i];
        }
        int circularSum = arrSum + kadaneAlgo( nums);
        return Math.max(maxNormal,circularSum);
    }
    
    public static int kadaneAlgo(int[] nums) {
        int res = nums[0];
        int maxFinding = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxFinding = Math.max(maxFinding + nums[i], nums[i]);
            res = Math.max(res, maxFinding);

        }
        return res;
    }
}