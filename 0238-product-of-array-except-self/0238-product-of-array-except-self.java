class Solution {
    /*
    Intuition:
    - Calculate left sum array - for each index find the product of all elements that are on its left.
    - Calculate right sum array - for each index find the product of all elements that are on its right.
    - Now multiply left and right sum arrays at each index.
    */
    public int[] productExceptSelf(int[] nums) {
        int[] leftSum = new int[nums.length];
        leftSum[0] = 1;
        for( int i=1; i< nums.length; i++){
            leftSum[i] = leftSum[i-1] * nums[i-1];
        }
        
        int[] rightSum = new int[nums.length];
        rightSum[nums.length-1] = 1;
        for( int i=nums.length-2; i>=0; i--){
            rightSum[i] = nums[i+1]* rightSum[i+1];
        }
        
        for( int i =0; i<leftSum.length; i++){
            leftSum[i] = leftSum[i] * rightSum[i];
        }
        
        return leftSum;
    }
}