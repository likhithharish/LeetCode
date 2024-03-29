class Solution {
    // make freq count map with string as key, create a bucket freq list with index as freq and array in the index value.
    //loop from back of bucket list and get k freq words by sorting the bucket[i] .
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s: words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        List<String>[] bucket = new List[words.length+1];
        for(String n:map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null)
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }
        
        
        List<String> res = new ArrayList<>();
        for(int i=bucket.length-1; i>=0 && k!=0; i--){
            if(bucket[i]!= null){
                int length = bucket[i].size();
                Collections.sort(bucket[i]);
                int index =0;
                while(length > 0 && k!=0){
                    res.add(bucket[i].get(index));
                    index++;
                    length--;
                    k -= 1;
                }
            }
            
        }
        return res;
    }
}