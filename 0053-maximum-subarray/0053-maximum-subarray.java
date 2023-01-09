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
        // int temp[] = new int[nums.length];
        // temp[0] = nums[0];
        // for( int i=1; i< nums.length; i++){
        //     //int res = Math.max(temp[i-1],nums[i]);
        //     int res = Math.max(temp[i-1]+nums[i], nums[i]);
        //     temp[i] = res;
        // }
        // int max = temp[0];
        // for( int i: temp){
        //     if(i> max){
        //         max = i;
        //     }
        // }
        // return max;
    }
}