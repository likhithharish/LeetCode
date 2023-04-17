class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] =0;
        for( int i=1; i<=n; i++){
            res[i] = countBitsInNum(i);
        }
        return res;
    }
    
    public int countBitsInNum( int num){
        int res =0;
        while(num>0){
            num = num & (num-1);
            res = res +1;
        }
        return res;
    }
}