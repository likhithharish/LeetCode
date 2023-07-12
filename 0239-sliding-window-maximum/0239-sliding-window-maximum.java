class Solution {
    // Use a deuqe to add elem to the last 
    // - add first k elem to queue in last, if last elem is less than curr , remove last elementss and then add curr.
    //- update result in a array by checking queue first 
    // - if window is reaching next , remove previous window elem in que from first.
    // same logic as adding elem to the last (remove small elem)
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){return nums;}
       Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < k; ++i) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
    
        for (int i = k; i < nums.length; ++i) {
            res[index] = nums[dq.peek()];
            index++;
            while ((!dq.isEmpty()) && dq.peek() <= i - k){
                dq.removeFirst();
            }

            while ((!dq.isEmpty()) && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }

            dq.addLast(i);
        }
        res[index] = nums[dq.peek()];
        return res;
    }
}