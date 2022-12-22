class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product,start;
        if(nums[0]!=0){
            start =1;
            product =nums[0];
        }else{
            start =0;
            product =1;
        }
        int zeroCount =0;
        boolean zero = false;
        
        for( int i=start; i< nums.length; i++){
            if(nums[i]!=0){
                product = product * nums[i];
                
            }else{
                zero = true;
                zeroCount++;
            }
        }
        
        if(zeroCount>1){
            for( int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }else{
            for( int i=0;i<nums.length;i++){
                if(zero & nums[i]!=0){
                nums[i]=0;
            }else if ( zero & nums[i]==0){
                nums[i]= product;
            }else{
                nums[i] = product/nums[i];
            }
            }
        }
        return nums;
    }
}