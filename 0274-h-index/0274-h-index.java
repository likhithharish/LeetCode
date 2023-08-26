class Solution {
    
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
       // HashMap<Integer, Integer> map = new HashMap<>();
       //  for(int i=0;i<citations.length; i++){
       //      if(!map.containsKey(citations[i])){
       //          map.put(citations[i], citations.length -i);
       //      }
       //  }
        //System.out.println(map);
        int paper = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i=0; i< citations.length; i++){
            if(citations[i] != paper){
                int temp = Math.min(citations[i], citations.length -i);
                if(temp > res){
                    res = temp;
                    paper = citations[i];
                }
            }
        }
        
        // int res = Integer.MIN_VALUE;
        // for(Map.Entry<Integer, Integer> e : map.entrySet()){
        //     int tempVal = Math.min(e.getKey(), e.getValue());
        //     res = Math.max(res, tempVal);
        // }
        return res;
    }
}