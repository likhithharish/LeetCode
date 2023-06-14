class Solution {
    /*
    - keep a sliging window i(left, j(right). keep track of char index in a map and if char already exists in map , check  if left point is not ahead of prev char index , move left point to new char index +1 and update in map. (corner case - left point check 'abba')
    */
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int res =0;
        int i=0;
        for(int j=0; j<s.length() && i<s.length(); j++){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), j);
            }else{
                if(  !(i>map.get(s.charAt(j))) ){
                    i = map.get(s.charAt(j)) + 1; //move the window left 
                }
                map.put(s.charAt(j),j);
            }
            res = Math. max(res, j-i+1);
        }
        return res;
    }
}