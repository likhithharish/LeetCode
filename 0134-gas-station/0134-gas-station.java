class Solution {
    // method 1 (TLE) - Consider each as start and travel until u reach start again while computing curr_gas( ifcurr_gas < 0 break and update start).
    // Method 2 - Use deque (a- Keep adding items to end of deque while curr_gas>=0) (b- keep removing items from front of deque while curr_gas<0)
    // Corner case of method 2 : curr_gas<0 and deque is empty , make curr_gas =0; run 2*n times to use circular array
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // for (int start = 0; start < gas.length; start++) {
        //     int curr_gas = 0;
        //     int end = start;
        //     while (true) {
        //         curr_gas += (gas[end] - cost[end]);
        //         if (curr_gas < 0) {
        //             break;
        //         }
        //         end = (end + 1) % gas.length;
        //         if (start == end) {
        //             return (start );
        //         }
        //     }
        // }
        // return -1;
        Deque<Integer> dq = new LinkedList<>();
        int n = gas.length;
        int curr_gas = 0;
        for (int i = 0; i < 2*n; i++) {
            int k = (i % n);
            curr_gas += gas[k] - cost[k];
            if (curr_gas >= 0) {
                dq.addLast(k);
            } else {
                while (!dq.isEmpty() && (curr_gas - (gas[dq.peekFirst()] - cost[dq.peekFirst()])) < 0) {
                    int index = dq.removeFirst();
                    curr_gas -= (gas[index] - cost[index]);
                }
                if(dq.isEmpty() && curr_gas<0){//corner case
                    curr_gas =0;
                }
            }
            if (dq.size() == n) {
                return dq.peekFirst();
            }
        }
        return -1;
    }
}