class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<groupSizes.length; i++){
            if(map.containsKey(groupSizes[i]) ){
                List<Integer> temp = map.get( groupSizes[i] );
                temp.add(i);
                map.put(groupSizes[i] , temp);
            }else{
                map.put(groupSizes[i], new ArrayList<>(Arrays.asList(i)));
            }
        }
        
        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            if(e.getKey() == e.getValue().size()){
                res.add(e.getValue());
            }else{
                int size = e.getKey();
                List<Integer> temp = e.getValue();
                int count = 0;
                List<Integer> out = new ArrayList<>();
                while(count != size && !temp.isEmpty()){
                    int val = temp.remove(temp.size()-1);
                    count++;
                    out.add(val);
                    if(count == size){
                        res.add(out);
                        out = new ArrayList<>();
                        count = 0;
                    }
                }
            }
        }
        return res;
        
    }
}