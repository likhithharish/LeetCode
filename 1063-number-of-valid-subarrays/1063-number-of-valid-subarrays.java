class Solution {
    // for each number count itself and check what all values are greater than or equal to that (increment temp count and add it to res),
    // if encounter a value less than that , break it.
    public int validSubarrays(int[] nums) {
        
//         int res =0;
//         for(int i=0; i< nums.length ; i++){
//             res += 1;
//             int tempCount =0;
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[j]>= nums[i]){
//                     tempCount += 1;
//                 }else{
//                     break;
//                 }
//             }
//             res += tempCount;
//         }
        
//         return res;
         int ans = 0;
        Stack<Integer> monotonicStack = new Stack<>();
        // use monotonic stack to store index of elements in non-decreasing order
        for (int i = 0; i < nums.length; i++) {
            while (!monotonicStack.isEmpty() && nums[monotonicStack.peek()] > nums[i]) {
                ans += (i - monotonicStack.pop());
            }
            monotonicStack.add(i);
        }
        // any element remaining in the stack doesn't have a smaller element to the right of it
        while (!monotonicStack.isEmpty()) {
            ans += (nums.length - monotonicStack.pop());
        }
        return ans;
    }
}