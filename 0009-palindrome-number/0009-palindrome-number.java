class Solution {
    // String palindrome logic
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int i=0,j =num.length()-1;
        while(i<=j){
            if(num.charAt(i)!= num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}