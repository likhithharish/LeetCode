class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        int count =1;
        int res = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count ++;
                res++;
                if(count>2){
                    dups.add(i);
                    res -= 1;
                }
            }else{
                count =1;
                
                res++;
            }
        }
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(!dups.contains(i)){
                nums[index] = nums[i];
                index++;
            }
        }
        return res;
    }
}