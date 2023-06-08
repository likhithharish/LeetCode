class Solution {
    public int findDuplicate(int[] nums) {
        int[] temp = new int[nums.length+1];
        for(int i=0;i<nums.length; i++){
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