class Solution {
    // Intuition: when gas_cost becomes zero, update start and keep track of it in prev_gas.
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_cost =0;
        int start = 0, prev_gas =0;
        for(int i=0; i< gas.length; i++){
            gas_cost += gas[i] - cost[i];
            if(gas_cost < 0){
                prev_gas += gas_cost;
                start = i+1;
                gas_cost =0;
            }
        }
        
        return (prev_gas + gas_cost >=0) ? start : -1;
    }
}