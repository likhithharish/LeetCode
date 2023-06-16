class Solution {
    /* 1) sort s1 and substring of s2 and compare 
    2) compute hash of s1 and substrings in s2*/
    public boolean checkInclusion(String s1, String s2) {
        int i1 = hash(s1);
        for(int i=0; i<=s2.length()- s1.length(); i++){
            if(hash(s2.substring(i,i+s1.length())) == i1){
                return true;
            }
        }
        return false;
    }
    
    public int hash(String s){
        char[] c = new char[26];
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i)- 'a']++;
        }
        return Arrays.hashCode(c);
    }
}