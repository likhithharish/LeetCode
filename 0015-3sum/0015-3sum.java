class Solution {
    /*
    Intuition:
    - Sort the array , and loop through .
    - to avoid duplicates , check if prev number is not same as curr .
    */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // -4, -1, -1, 0 , 1, 2
        for( int i=0; i<nums.length; i++){
            int target = 0- nums[i];
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int start = i+1;
                int end = nums.length -1;
                while(start<end){
                    if( nums[start] + nums[end] == target){
                        result.add( Arrays.asList(nums[start], nums[end], nums[i]));
                        //avoid duplicates
                        while(start < end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start<end && nums[end]== nums[end-1]){
                            end--;
                        }
                        start++;
                        end--;
                        
                    }else if(nums[start]+ nums[end]>target){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        
        return result;
    }
    
    
}