class Solution {
    public int reverse(int x) {
//         int num = 0;
//         while( x!=0){
//             int lastDigit = x %10;
//             if(num<Integer.MIN_VALUE/10 && (num == Integer.MIN_VALUE/10 && lastDigit< -8)){
//                 return 0;
//             }
//             if( num> Integer.MAX_VALUE/10 && (num == Integer.MAX_VALUE/10 && lastDigit>7)){
//                 return 0;
//             }
//             num = num * 10 + lastDigit;
//             x = x/10;
//         }
        
//         return num;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}