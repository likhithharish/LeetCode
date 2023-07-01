class Solution {
    //Mark the duplicate indexes in list and update nums if list not contains the index.
    public int removeDuplicates(int[] nums) {
        List<Integer> indexes = new ArrayList<>();
        int count =1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count>2){
                indexes.add(i);
            }
        }
        int j =0;//two pointer approach
        for(int i=0;i<nums.length; i++){
            if(!indexes.contains(i)){
                nums[j] = nums[i];
                j++;
            }
        }
        return nums.length- indexes.size();
    }
}