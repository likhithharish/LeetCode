class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int res =0;
        int i=0;
        for(int j=0; j<s.length() && i<s.length(); j++){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), j);
            }else{
                if(map.get(s.charAt(j)) - j < 0 && !(i>map.get(s.charAt(j))) ){
                    i = map.get(s.charAt(j)) + 1;
                    
                }
                map.put(s.charAt(j),j);
            }
            
            res = Math. max(res, j-i+1);
        }
        return res;
    }
}