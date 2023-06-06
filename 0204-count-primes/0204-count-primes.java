class Solution {
    //Steve of erasthoses algo
    /*
    - Create boolean arr of size n+1 = true, mark all multiples of 2,3,5 and so on as false. loop through array and count true values.
    */
    public int countPrimes(int n) {
        int count =0;
        boolean[] countPrimes = new boolean[n];
        Arrays.fill(countPrimes, true);
        
        for( int i=2; i * i<n ; i++){
            if(countPrimes[i]){
                
                for(int j=i*2; j<n ; j= j+i){
                    countPrimes[j] = false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(countPrimes[i]){count++;}
        }
        
        return count;
    }
}