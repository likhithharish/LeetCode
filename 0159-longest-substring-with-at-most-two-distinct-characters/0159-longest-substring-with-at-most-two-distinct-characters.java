class Solution {
    // Sliding Window + Hash : 
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int res =0;
        for(int j=0; j<s.length() && i<s.length(); j++){
            map.put(s.charAt(j),j);
            
            if(map.size()==3){
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                i = index +1;
            }
            res = Math.max(res, j-i+1);
        }
        return res;
    }
}