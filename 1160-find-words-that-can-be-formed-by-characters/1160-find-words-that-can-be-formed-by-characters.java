class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        for(char c: chars.toCharArray()){
            arr[c-'a']++;
        }
        int res =0;
        for(String s: words){
            int[] freq = new int[26];
            boolean found = true;
            for(char c: s.toCharArray()){
                freq[c-'a']++;
                if(freq[c-'a']> arr[c-'a'] ){
                    found = false;
                    break;
                }
            }
            if(found){
                res += s.length();
            }
        }
        return res;
    }
}