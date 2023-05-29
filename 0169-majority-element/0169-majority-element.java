class Solution {
    /*
    Basic Intuition : Sort and find the majority element
    */
    public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int currElem = nums[0];
//         int maxElem = nums[0];
//         int maxCount =1;
//         int res = 0;
//         for( int i=1; i< nums.length; i++){
//             if(nums[i] == currElem){
//                 maxCount++;
//             }else{
//                 currElem = nums[i];
//                 maxCount =1;
//             }
//             if(maxCount> res){
//                 maxElem = nums[i];
//                 res = maxCount;
//             }
            
//         }
//         return maxElem;
       //Boyer -Moore Voting Algorithm -NOTES
        int count =1;
        int res = nums[0];
        for ( int i=1; i<nums.length ; i++){
            if(res == nums[i]){
                count++;
            }else{
                count--;
                
            }
            if(count <0 ){
                res = nums[i];
                count =1;
            }
        }
        return res;
    }
}