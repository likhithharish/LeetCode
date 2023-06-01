class Solution {
    /*
    Intuition:
    - Keep two pointers, one from start index and other from end index
    - Compute sum of two indexes, if less than target , increment start pointer 
    - If greater than target, decrement end pointer. Return both indexes when target is found.
    */
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length -1;
        while(start<=end){
            if(numbers[start]+numbers[end] == target){
                return new int[]{start+1,end+1};
            }else if(numbers[start]+ numbers[end]> target){
                end--;
            }else{
                start++;
            }
        }
        return new int[0];
    }
}