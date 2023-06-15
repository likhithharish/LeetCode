class Solution {
    /* -One half is guranteed to be sorted.
    - Check first half mid >=low -> compare target to low AND MID;
    - else compare target with mid and high - second half
    */
    public int search(int[] nums, int target) {
        int low =0, high = nums.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<nums[mid]){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            }else{
                if(target>nums[mid] && target<=nums[high]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}