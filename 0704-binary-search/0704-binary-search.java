class Solution {
    public int search(int[] nums, int target) {
        
        int low =0;
        int high = nums.length-1;
        while( low<=high){
            int mid = (low + high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
            
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}