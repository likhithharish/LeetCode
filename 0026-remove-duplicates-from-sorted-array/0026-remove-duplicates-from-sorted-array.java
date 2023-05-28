class Solution {
    /*
    Intuition:
    -Make a copy arr,
    -first elem is same, loop from second elem[index=1] in copy array and push the element if its not equal to prev elem. Push it to main array. keep a count on elements pushed.
    */
    public int removeDuplicates(int[] nums) {
        int k=1;
        int[] copy = Arrays.copyOf(nums, nums.length);
        for( int i=1; i<copy.length; i++){
            if(copy[i-1]!= copy[i]){
                nums[k] = copy[i]; 
                k++;
            }
        }
        return k;
    }
}