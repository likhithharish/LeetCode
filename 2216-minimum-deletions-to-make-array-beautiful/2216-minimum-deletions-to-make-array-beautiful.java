class Solution {
    // https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/discuss/1886993/JAVASimple-Detailed-Solution-with-O(N)-time-O(1)-space!!
    
    // Check conditions at even indexes and increment res(del count), after all nums.length - res is still odd, increment res and return. 
    public int minDeletion(int[] nums) {
        int res =0;
        for(int i=0; i< nums.length-1; i+=2){
            if(nums[i] == nums[i+1]){
                res++;
                i--;
            }
        }
        return (nums.length - res)%2==1 ? ++res : res;
    }
    
    
}