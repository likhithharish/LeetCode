class Solution {
    // Appraoch 1 : Sort and return (n-k)th element. ()
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}