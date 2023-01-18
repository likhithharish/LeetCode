class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        int maxCount = 1;
        int maxElem = nums[0];
        int res =0;
        for( int i=1; i< nums.length; i++){
            if( nums[i]==curr){
                maxCount += 1;
                
            }else{
                curr = nums[i];
                maxCount = 1;
            }
            
            if(maxCount > res){
                    maxElem = curr;
                    res = maxCount;
            }
        }
        return maxElem;
    }
}