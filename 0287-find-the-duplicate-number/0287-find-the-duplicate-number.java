class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!= fast);// first phase end where slow and fast moved in diff paces
        
        slow = nums[0];//reset slow and leave fast at its new position
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }// second phase end where slow and fast move in same pace and meet at one elem.
        return slow;
    }
}