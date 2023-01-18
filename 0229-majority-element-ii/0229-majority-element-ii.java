class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length==1){
            return Arrays.stream(nums).boxed().toList();
        }else if( nums.length==2){
            if(nums[0]==nums[1]){
                return new ArrayList<>(Arrays.asList(nums[0]));
            }else{
                return Arrays.stream(nums).boxed().toList();
            }
        }
        List<Integer> res  = new ArrayList<>();
        Arrays.sort(nums);
        int curr = nums[0];
        int currCount = 1;
        for( int i=1; i< nums.length; i++){
            
            if(nums[i]==curr){
                currCount += 1;
            }else{
                curr = nums[i];
                currCount =1;
            }
            if(currCount > nums.length/3 && !res.contains(curr)){
                res.add(curr);
            }
            
        }
        return res;
    }
}