class Solution {
    public int missingNumber(int[] nums) {
        // int[] res = new int[nums.length+1];
        // for(int i:nums){
        //     res[i] = 1;
        // }
        // for(int i=0; i<res.length; i++){
        //     if(res[i]!=1){return i;}
        // }
        // return -1;
        int ans = nums.length;
        for(int i=0; i<nums.length; i++){
            int temp = i ^ nums[i];
            ans = ans ^ temp;
        }
        return ans;
    }
}