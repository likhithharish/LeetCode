class Solution {
    /*
    Intuition:
    - Keep a map with hashcode for string and its anagrams.
    - Calculate hashcode by using a int arr and 
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        
        for( String s: strs){
            int hashCode = hash(s);
            map.putIfAbsent(hashCode,  new ArrayList<String>());
            map.get(hashCode).add(s);
        }
        
        map.forEach((k,v) -> {
            res.add(v);
        });
        return res;
    }
    
    public int hash(String s){
        int[] charArr = new int[26];
        for( int i=0; i< s.length(); i++){
            charArr[s.charAt(i) - 'a'] += 1;
        }
        
        return Arrays.hashCode(charArr);
    }
}