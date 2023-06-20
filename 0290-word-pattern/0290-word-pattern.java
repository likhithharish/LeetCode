class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();
        String[] vals = s.split(" ");
        if(pattern.length() != vals.length){
            return false;
        }
        for(int i=0; i<vals.length; i++){
            if( (charMap.containsKey(pattern.charAt(i)) && !charMap.get(pattern.charAt(i)).equals(vals[i])) ||
              (strMap.containsKey(vals[i]) && strMap.get(vals[i])!=pattern.charAt(i)) ){
                return false;
            }else{
                charMap.put(pattern.charAt(i), vals[i]);
                strMap.put(vals[i], pattern.charAt(i));
            }
        }
        return true;
    }
}