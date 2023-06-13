class Solution {
    /*
    - For each character in 0th string, compare with each character in other strings and add to a result. if characters are diff , return result.
    */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            for(String s : strs){
                if(i==s.length() || strs[0].charAt(i)!=s.charAt(i)){
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}