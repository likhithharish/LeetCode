class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0; i< nums.length; i++){
            for( int j=i+1;j<=i+indexDiff; j++){
                if (j == nums.length) {
                    break;
                }
                if(Math.abs(nums[i]-nums[j])<=valueDiff && Math.abs(i-j)<=indexDiff){
                    return true;
                }
            }
        }
        return false;
    }
}