class Solution {
    /*Intuition:
    - Reverse the number is logic is same for both positive and negative numbers.
    - Issue is to handle the reversed number doesnt go beyond the 32 bit bounds.
    - Have to do this before adding the last digit . So we check if current reveresed number is equal to Integer max and min values(without last digits) and compare accordingly with lastDigit also.
    */
    public int reverse(int x) {
        int num = 0;
        while( x!=0){
            int lastDigit = x %10;
            if(num<Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && lastDigit< -8)){
                return 0;
            }
            if( num> Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && lastDigit>7)){
                return 0;
            }
            num = num * 10 + lastDigit;
            x = x/10;
        }
        
        return num;
        
    }
}