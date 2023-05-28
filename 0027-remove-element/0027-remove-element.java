class Solution {
    /*
    Intuition:
    - Create copy of initial array and move elements to initial array if its not equal to val , and increment count.
    */
    public int removeElement(int[] nums, int val) {
        int k=0,valCount=0;
        int[] copy = Arrays.copyOf(nums,nums.length);
        for(int i=0; i<nums.length; i++){
            if(copy[i]==val){
                valCount++;
            }else{
                nums[i-valCount] = copy[i];
                k++;
            }
            
        }
        
        return k;
    }
}