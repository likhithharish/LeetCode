class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] temp = new int[nums.length];
        int index =0, dups=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]< pivot){
                temp[index]= nums[i];
                index++;
            }else if(nums[i] == pivot){
                dups++;
            }
        }
        
        for(int i=0; i<dups; i++){
            temp[index] = pivot;
            index++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                temp[index] = nums[i];
                index++;
            }
        }
        return temp;
    }
}