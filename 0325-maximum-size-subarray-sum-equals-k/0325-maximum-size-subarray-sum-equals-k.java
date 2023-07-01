class Solution {
    //PrefixSum + Hashing.
    // if prefixSum -sum already exists then calculate length.
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (preSum == k) {
                // array starts with 0
                res = i + 1;
            }
            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
            if (map.containsKey(preSum - k)) {
                res = Math.max(res, i - map.get(preSum - k));
            }
        }
        return res;
    }
}