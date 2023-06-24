class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int output = Integer.MIN_VALUE;
        int j=0; 
        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum += nums[i];
            
            while(nums[i]*(i-j+1)- sum>k){
                sum -= nums[j];
                j++;
            }
            output = Math.max(output,i-j+1);
        }
        return output;
    }
}