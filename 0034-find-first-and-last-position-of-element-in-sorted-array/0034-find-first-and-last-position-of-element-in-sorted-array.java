class Solution {
    /*Intuition:
    - Find first occ of the element and last occur of the element and do last-first+1
    */
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums,target), lastOccurance(nums, target)};
    }
    
    public int firstOccurence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] != nums[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public int lastOccurance(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid != nums.length - 1 && nums[mid + 1] != nums[mid]) {
                    return mid;

                } else if (mid == nums.length - 1 && nums[mid] == target) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}