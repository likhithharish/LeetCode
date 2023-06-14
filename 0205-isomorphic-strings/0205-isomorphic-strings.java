class Solution {
    //Keep track of mapped elementes in two maps; one for s and one for t.
    // if exists in either of map, compare with other string char s/t.
    // QUestion is tricky as s can be replaced with t or viceversa
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for( int i=0; i<t.length(); i++){
            char sVal = s.charAt(i);
            char tVal = t.charAt(i);
            if(mapS.containsKey(sVal) && mapS.get(sVal) != tVal ||
               mapT.containsKey(tVal) && mapT.get(tVal) != sVal){
                return false;
            }
            mapS.put(sVal, tVal);
            mapT.put(tVal, sVal);
        }
        return true;
    }
}