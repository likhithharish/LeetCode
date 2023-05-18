class Solution {
    /*
    Intuition:
    - Start from both ends and compare each character and if not same return false.
    */
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int low =0, high= s.length()-1;
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){ return false;}
            low++;
            high--;
        }
        return true;
    }
}