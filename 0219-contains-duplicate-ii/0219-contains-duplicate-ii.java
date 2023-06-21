class Solution {
    // Use a hashmap and update index in it, if map contains value compute the diff and return true or else update map value.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length ; i++){
            for(int j=i+1; j<=i+k && j<nums.length; j++){
                if(nums[j]==nums[i] && Math.abs(j-i)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}