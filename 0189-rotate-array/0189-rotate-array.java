class Solution {
    // Method 1: Using extra space
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        if(k>nums.length){
            k= (k) % nums.length;
        }
        int[] temp = new int[nums.length];
        int index =0;
        for(int i=nums.length -k; i< nums.length; i++){
            temp[index] = nums[i];
            index++;
        }
        for(int i=0; i< nums.length - k; i++){
            temp[index] = nums[i];
            index++;
        }
        for(int i=0; i< temp.length; i++){
            nums[i] = temp[i];
        }
    }
}