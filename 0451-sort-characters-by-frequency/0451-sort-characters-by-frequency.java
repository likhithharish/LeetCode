class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry e : map.entrySet()){
            maxHeap.add(e);
        }
        //System.out.println(maxHeap);
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