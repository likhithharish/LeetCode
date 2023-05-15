class Solution {
    /*
    Intuition::
    - Use a hashmap to count the array elements .
    - Use a priority queue to sort the map and keep map key,value pairs in pq.
    - loop through priority queue and get top K elements from pq.
    */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
    PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
        
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }
        
        int[] res = new int[k];
        for( int i=0; i< k; i++){
            res[i] =pq.poll().getKey();
        }
        
        return res;
        
    }
}