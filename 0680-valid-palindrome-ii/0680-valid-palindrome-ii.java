class Solution {
    /*
    - If char at low and high are not equal , check the middle string is palindrome or not, if not return false.
    */
    public boolean validPalindrome(String s) {
        int skip =0;
        int low =0, high =s.length()-1;
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
                if(isPalindrome(s, low+1,high ) || isPalindrome(s,low,high-1)){
                    return true;
                }else{
                    return false;
                }
            }
            low++;
            high--;
        }
        
        return true;
    }
    
    public boolean isPalindrome(String s, int low, int high){
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}