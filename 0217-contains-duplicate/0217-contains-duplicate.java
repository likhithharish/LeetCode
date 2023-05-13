class Solution {
    /* 
        Intuition::
            - Use a set since it removes duplicates on removal.
    */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for( int i: nums){
            set.add(i);
        }
        return nums.length!=set.size();
    }
}