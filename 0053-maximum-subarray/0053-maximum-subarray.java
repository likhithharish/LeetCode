class Solution {
    public int maxSubArray(int[] nums) {
        int sum =Integer.MIN_VALUE, tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum = tempSum +nums[i];
            if(tempSum > sum){
                sum = tempSum;
                
            }
            if(tempSum <0){
                tempSum =0;
            }
            
        }
        return sum;
    }
}