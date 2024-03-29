class Solution {
    // Use a char count array and update magazine, decrement ransomNote in another loop.
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] chars = new int[26];
        for(int i=0; i<magazine.length(); i++){
            chars[magazine.charAt(i)- 'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(chars[ransomNote.charAt(i) - 'a'] <=0){
                return false;
            }
            chars[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
    
}