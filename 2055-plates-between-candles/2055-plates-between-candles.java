class Solution {
    /*
    Intuition- keep track of index of candle and * before that candle in a tree map(sorted).
    - for each query , find key in map >= start and <=end of query.
    */
    public int[] platesBetweenCandles(String s, int[][] queries) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count =0;
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i)=='|'){
                map.put(i, count);
            }else{
                count++;
            }
        }
        int[] res = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            Map.Entry<Integer, Integer> first = map.ceilingEntry(queries[i][0]) , last = map.floorEntry(queries[i][1]);
            if(first != null && last !=null){
                res[i] = Math.max(0,last.getValue() - first.getValue());
            }
            
        }
        return res;
    }
}