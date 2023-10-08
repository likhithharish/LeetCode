class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j); //found the substring
                int size=0;
                if(isPalindrome(str)){ // found the palind
                    size=str.length();
                    if (size > max) {
                    max = size;
                    ans = str;  // longest substring
                    }

                }
            }
        }
        return ans;
    }
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}