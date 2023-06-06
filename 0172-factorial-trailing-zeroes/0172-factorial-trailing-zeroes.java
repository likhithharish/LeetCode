class Solution {
    /*
    Intuition:
    - Instead of counting 0 , by computing the factorial which fails in case of large num.
    - compute number of 5's in the series of n to 1.
    */
    public int trailingZeroes(int n) {
        int res = 0;
        for( int i=5; i<=n; i =i*5){
            res += n / i;
        }
        return res;
    }
}