class Solution {
    public int validSubarrays(int[] nums) {
        int res =0;
        for(int i=0; i< nums.length ; i++){
            res += 1;
            int tempCount =0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>= nums[i]){
                    tempCount += 1;
                }else{
                    
                    break;
                }
            }
            res += tempCount;
        }
        
        return res;
    }
}