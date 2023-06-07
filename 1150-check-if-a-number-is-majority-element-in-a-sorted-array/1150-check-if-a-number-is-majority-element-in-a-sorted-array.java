class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int count =1;
        int res = 0;
        for(int i=1;i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count+=1;
            }else{
                count =1;
            }
            if(count > nums.length/2){
                res = nums[i];
            }
        }
        return target==res;
    }
}