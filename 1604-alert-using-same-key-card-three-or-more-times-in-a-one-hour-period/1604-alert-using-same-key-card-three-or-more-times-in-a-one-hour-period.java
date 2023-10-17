class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<keyName.length; i++){
            if(!map.containsKey(keyName[i])){
                map.put(keyName[i], new ArrayList<>());
            }
            map.get(keyName[i]).add(keyTime[i]);
        }
        
        for(Map.Entry<String, List<String>> e : map.entrySet()){
                List<String> times = e.getValue();
                Collections.sort(times);
                for(int j=2; j<times.size(); j++){
                    if(calcTime(times.get(j-2), times.get(j)) <=60){
                        res.add(e.getKey());
                        break;
                    }
                }
        }
        
        Collections.sort(res);
        return res;
    }
    
    public static int calcTime(String t1, String t2){
        int h1 = Integer.parseInt(t1.substring(0,2));
        int min1 = Integer.parseInt(t1.substring(3));
        int h2 = Integer.parseInt(t2.substring(0,2));
        int min2 = Integer.parseInt(t2.substring(3));
        
        return (h2-h1)*60 + (min2-min1);
    }
}