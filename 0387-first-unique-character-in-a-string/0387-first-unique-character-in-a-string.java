class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for(char c: s.toCharArray()){
            chars[c-'a']++;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<chars.length; i++){
            if(chars[i]==1){
                res = Math.min(res, s.indexOf((char) i+'a'));
            }
        }
        return (res==Integer.MAX_VALUE)? -1 : res;
    }
}