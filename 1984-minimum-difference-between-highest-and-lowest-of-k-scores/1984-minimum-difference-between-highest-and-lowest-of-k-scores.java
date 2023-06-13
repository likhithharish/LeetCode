class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for(int i=0; i<=n-k ; i++){
            int val = nums[i];
            for(int j=(i+k-1);j<n;j++){
                res = Math.min(res, nums[j]-nums[i]);
            }
        }
        
        return res;
        
    }
}