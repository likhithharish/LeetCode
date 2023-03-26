class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() ==0){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int low = 0;
        int high = s.length()-1;
        while (low <= high) {
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
            
        }
        
        return true;
    }
}