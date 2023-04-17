class Solution {
    int[] tbl = new int[256];
    void initialize(){
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] =0;
        initialize();
        for( int i=1; i<=n; i++){
            res[i] = countBitsInNum(i);
        }
        return res;
    }
    
    public int countBitsInNum( int n){
        //Loopup Table approach:
        //return tbl[n & 255] + tbl[(n >> 8) & 255] + tbl[(n >> 16) & 255] + tbl[n >> 24];
        //Brain Kenninger Algo
        int res =0;
        while(n >0){
            n = n &(n-1);
            res += 1;
        }
        return res;
    }
}