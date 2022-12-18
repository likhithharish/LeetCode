class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int zeroCount=0;
        int j=0;
        for( int i=j; i< nums.length; i++){
            if( nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }else{
                zeroCount++;
            }
        }
        
        for( int i=0; i<zeroCount; i++){
            nums[nums.length-1-i] = 0;
        }
        
    }
}