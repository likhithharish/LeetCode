class Solution {
    //Similar to 567. compute hash of p and substrings in s
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int hashP = hash(p);
        for(int i=0; i<=s.length()-p.length(); i++){
            if(hash(s.substring(i, i+p.length())) == hashP){
                res.add(i);
            }
        }
        return res;
    }
    
    public int hash(String s){
        char[] c = new char[26];
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i)- 'a']++;
        }
        return Arrays.hashCode(c);
    }
}