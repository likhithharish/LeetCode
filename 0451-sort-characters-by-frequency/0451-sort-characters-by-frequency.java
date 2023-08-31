class Solution {
    ////[1] Use a HashMap and store all values, sort the hashmap based on values (maxHeap) and return by appending each key (value times) from maxheap.
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry e : map.entrySet()){
            maxHeap.add(e);
        }
        
        StringBuilder res = new StringBuilder();
        
        while(maxHeap.size() > 0){
            int count = maxHeap.peek().getValue();
            char c = maxHeap.poll().getKey();
            while(count>0){
                res.append(c);
                count--;
            }
        }
        
        return res.toString();
    }
}