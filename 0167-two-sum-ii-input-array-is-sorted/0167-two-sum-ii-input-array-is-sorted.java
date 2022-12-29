class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int maxindex = numbers.length-1;
        
        for( int i=0; i< numbers.length;i++){
            if(numbers[i]+numbers[maxindex]==target){
                return new int[]{i+1,maxindex+1};
            }
            if(numbers[i]+numbers[maxindex]>target){
                maxindex--;
                i--;
                continue;
            }
            if(numbers[i]+numbers[maxindex]<target){
                
                continue;
            }
        }
        
        return new int[0];
    }
}