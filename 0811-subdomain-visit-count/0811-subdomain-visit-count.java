class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : cpdomains){
            String[] vals = s.split(" ");
            //System.out.println(Arrays.toString(vals));
            int count = Integer.valueOf(vals[0]);
            
            String[] domains = vals[1].split("\\.");
            //System.out.println(Arrays.toString(domains));
            for(int i=0; i<domains.length; i++){
                StringBuilder str = new StringBuilder();
                str.append(domains[i]);
                for(int j=i+1; j<domains.length; j++){
                    str.append(".");
                    str.append(domains[j]);
                }
                if(map.containsKey(str.toString())){
                    map.put(str.toString(), map.get(str.toString()) + count);
                }else{
                    map.put(str.toString(), count);
                }
            }
        }
        
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> e: map.entrySet()){
            res.add(e.getValue()+" "+e.getKey());
        }
        return res;
    }
}