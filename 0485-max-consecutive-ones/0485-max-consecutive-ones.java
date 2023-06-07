class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length <= 1) {
            return (nums[0] == 0) ? 0 : 1;
        }

        int res = 0;
        int currCount = (nums[0] == 0) ? 0 : 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 1 && nums[i] == nums[i - 1]) {
                currCount += 1;
            } else if (nums[i - 1] == 0 && nums[i] == 1) {
                currCount = 1;
            }
            res = Math.max(res, currCount);
        }
        return res;
    }
}