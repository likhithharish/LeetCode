class Solution {
    public int reverse(int x) {
//         boolean symbol =false;
//         if(x<0){
//             x =0 -x;
//             symbol = true;
//         }
//         int n = x;
//         int count =0;
//         while(n>0){
//             n = n/10;
//             count++;
//         }
        
//         long num = 0;
//         while(x>0){
//             int digit = x %10;
//             x = x/10;
//             num = num + (int) (digit * Math.pow(10,(count-1)));
//             count--;
//         }
//         if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
//             return 0;
//         }
//         return (symbol) ? (int) -num : (int) num;
        //Improvised:
        long num =0;
        while(x != 0){
            int digit = x%10;
            num = num * 10 + digit;
            x = x/10;
            
        }
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){ num = -num;}
        return (int) num;
        
    }
}