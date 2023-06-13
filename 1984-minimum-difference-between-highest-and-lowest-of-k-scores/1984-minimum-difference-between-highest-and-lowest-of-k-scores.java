class Solution {
    /*
    Basic - Sort the array , find the starting maxValue for a index and compute diff and update res.Continue the loop till (n-k) elements only.
    */
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int low = 0, high = k -1;
        while(low<nums.length && high<nums.length){
            res = Math.min(res, nums[high]- nums[low]);
            low++;
            high++;
        }
        
        
        return res;
        
    }
}