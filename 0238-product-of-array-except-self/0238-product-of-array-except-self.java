class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product =1;
        for( int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                product *= nums[i];
            }
            if(nums[i]==0){
                zeroCount++;
            }
        }
        
        if(zeroCount ==1){
            for( int i=0; i< nums.length; i++){
                if(nums[i]==0){
                    nums[i] = product;
                }else{
                    nums[i]=0;
                }
            }
            return nums;
        }else if (zeroCount >=2){
            for( int i=0; i<nums.length; i++){
                nums[i] =0;
            }
            return nums;
        }else{
            for( int i=0; i<nums.length; i++){
                nums[i] = product / nums[i];
            }
        }
        
        return nums;
        
    }
}