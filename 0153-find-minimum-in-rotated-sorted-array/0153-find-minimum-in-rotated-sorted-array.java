class Solution {
    //Write the scenarios for 1,2,3,4,5 and in two cases u have to go left and rest all u go right.1,2,3,4,5 & 5,1,2,3,4 - left.
    public int findMin(int[] nums) {
        int low =0, high = nums.length -1;
        int res = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            res = Math.min(res,nums[mid]);
            if(nums[mid]>nums[low]&& nums[mid]<=nums[high] ||
               nums[mid]<=nums[low] && nums[mid]<nums[high]){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return res;
    }
}