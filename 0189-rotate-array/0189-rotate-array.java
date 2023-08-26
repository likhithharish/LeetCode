class Solution {
    // Method 1: Using extra space.
    // Method 2: Recursion.
    public void rotate(int[] nums, int k) {
        // if(nums.length==1){
        //     return;
        // }
        // if(k>nums.length){
        //     k= (k) % nums.length;
        // }
        // int[] temp = new int[nums.length];
        // int index =0;
        // for(int i=nums.length -k; i< nums.length; i++){
        //     temp[index] = nums[i];
        //     index++;
        // }
        // for(int i=0; i< nums.length - k; i++){
        //     temp[index] = nums[i];
        //     index++;
        // }
        // for(int i=0; i< temp.length; i++){
        //     nums[i] = temp[i];
        // }
        
        //Approach 2: Recursion:
        if(k > nums.length){
         k = k % nums.length;   
        }
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    
    public static int[] reverse(int[] nums, int start, int end){
        while(start< end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}