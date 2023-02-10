class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(high-low==1){
                int temp = Math.min(nums[high],nums[low]);
                min = Math.min(temp,min);
            }
            min = Math.min(nums[mid], min);
            if(nums[mid]>nums[low] && nums[mid]>nums[high]){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return min;
    }
    //else if(nums[mid]<nums[low] && nums[mid]<nums[high])
}