class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int res = Integer.MIN_VALUE;
        for(int j=0; j<s.length() && i<s.length() ; j++){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j) , j);
            }else{
                i = Math.max(i, map.get(s.charAt(j)) +1);
                map.put(s.charAt(j),j);
            }
            res = Math.max(res, j-i+1);
        }
        return (res==Integer.MIN_VALUE) ? 0 : res;
    }
}