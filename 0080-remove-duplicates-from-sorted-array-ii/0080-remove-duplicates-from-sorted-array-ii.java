class Solution {
    // Keep two pointers , 
    // First count the similar integers and loop only 2 times or less and swap till first pointer, 
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right =0;
       
        while(right<nums.length){
            int count =1;
            while(right+1< nums.length && nums[right] == nums[right+1]){
                right+=1;
                count+=1;
            }
            int start = Math.min(2,count);
            for(int i=0; i<start; i++){
                nums[left] = nums[right];
                left +=1;
            }
            right +=1;
        }
        
        return left;
    }
}