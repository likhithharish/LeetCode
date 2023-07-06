class Solution {
    //Increment the freq of elements in a temp array, loop through temp and return any element with freq>1.
    // no extra space - cycle in a LL , slower than above.
    public int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        for(int i=0;i<temp.length; i++){
            if(temp[i]>1){
                return i;
            }
        }
        return -1;
    }
}