class Solution {
    // O(log n) -> binary search
    //Naive : loop till end and compare neighbours and return if found, handle corners seperately.
    //Improved : 
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || nums[mid - 1] <= nums[mid]) && 
                (mid == n - 1 || nums[mid + 1] <= nums[mid])) {
                //compare mid with neighbour
                return mid;
            }
            if (mid>0 && nums[mid - 1] >= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}