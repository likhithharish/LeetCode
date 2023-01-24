class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        for( String s: strs){
            int[] count = new int[26];
            for( int i=0; i< s.length();i++){
                count[s.charAt(i)-'a']++;
                
            }
            StringBuilder str = new StringBuilder();
            for( int i=0; i< 26; i++){
                str.append("#");
                str.append(count[i]);
            }
            
            if(!map.containsKey(str.toString())){
                map.put(str.toString(), new ArrayList());
            }
            map.get(str.toString()).add(s);
            
        }
        return new ArrayList(map.values());
    }
}