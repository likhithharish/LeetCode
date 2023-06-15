class Solution {
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