class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length/2];
        for(int i=0; i< nums.length/2; i++){
            temp[i] = nums[i];
        }
        int j=nums.length/2;
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(i%2 ==0){
                nums[i] = nums[j];
                j++;
            }else{
                nums[i] = temp[k];
                k++;
            }
        }
        
        return nums;
    }
}