class Solution {
    public int pivotIndex(int[] nums) {
        int[] lSum = new int[nums.length];
        lSum[0] = nums[0];
        for(int i=1; i<lSum.length ; i++){
            lSum[i] = lSum[i-1] + nums[i];
        }
        int rightSum =nums[nums.length-1];
        int res = rightSum == lSum[lSum.length-1] ? lSum.length-1 : Integer.MAX_VALUE;
        for(int i=nums.length-2; i>=0; i--){
            rightSum += nums[i];
            if(rightSum == lSum[i]){
                res = Math.min(res, i);
            }
        }
        return (res==Integer.MAX_VALUE) ? -1 : res;
    }
}