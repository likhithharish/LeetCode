class Solution {
    // PrefixSum + Hashing
    // Replace 0 with -1 and the ques becomes longest subarray with sum 0.
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int prefixSum = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            
            if(prefixSum ==0){
                res = i+1;
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
            if (map.containsKey(prefixSum)) {
                res = Math.max(res, i - map.get(prefixSum));
            }
        }
        return (res);
    }
}