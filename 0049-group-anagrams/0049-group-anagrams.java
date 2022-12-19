class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> results = new ArrayList<List<String>>();
        /*List<Integer> done = new ArrayList<>();
        
        for( int i=0;i<strs.length;i++){
            List<String> temp = new ArrayList<>();
            if(!done.contains(i)){
                temp.add(strs[i]);
                for( int j=i+1;j<strs.length;j++){
                    if(isAnagram(strs[i],strs[j])){
                        done.add(i);
                        done.add(j);
                        temp.add(strs[j]);
                    }
                }
                results.add(temp);
            }
        }
        return results;*/ // Basic Approach
        
        //Better Solution 
        Map<String, List> results = new HashMap<String,List>();
        for(String s : strs){
            int[] count = new int[26];
            for( int i=0; i<s.length() ; i++){
                count[s.charAt(i)-'a']++;
            }
            StringBuilder str = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                str.append('#');
                str.append(count[i]);
            }
            
            if(!results.containsKey(str.toString())){
                results.put(str.toString(), new ArrayList());
            }
            results.get(str.toString()).add(s);
        }
        
        return new ArrayList(results.values());
     
    }
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        for( int i=0; i<s.length() ; i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        
        for( int i: count){ if(i!=0){return false;} }
        
        return true;
    }
}