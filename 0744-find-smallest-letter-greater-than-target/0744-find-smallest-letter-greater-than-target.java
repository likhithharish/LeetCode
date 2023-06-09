class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0; i<letters.length; i++){
            
            if(Character.compare(target, letters[i]) < 0){
                return letters[i];
            }
        }
        
        return letters[0];
    }
}