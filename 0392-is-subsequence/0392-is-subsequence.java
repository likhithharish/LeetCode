class Solution {
    /*
    Run loop for string s, for each character in s , find if present in t. for next character in s, start from next index in t . whenever not found return false.
    */
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        boolean found =false;
        for(int i=0; i<s.length(); i++){
            found = false;
            for(int j=start; j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    found = true;
                    start = j+1;
                    break;
                }else{
                    found = false;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}