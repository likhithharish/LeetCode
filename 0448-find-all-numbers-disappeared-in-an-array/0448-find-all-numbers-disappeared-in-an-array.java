class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= -1){
                int idx = nums[i] -1;
                while(nums[idx]!= -1){
                    int temp = nums[idx];
                    nums[idx] = -1;
                    idx = temp-1;
                }
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= -1){
                res.add(i+1);
            }
        }
        return res;
    }
}