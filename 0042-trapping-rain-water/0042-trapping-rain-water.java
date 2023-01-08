class Solution {
    public int trap(int[] height) {
        // int res = 0;
        // for( int i =1; i<height.length -1; i++){
        //     int lmax = height[i];
        //     for ( int j=0;j<i;j++){
        //         lmax = Math.max(lmax, height[j]);
        //     }
        //     int rmax = height[i];
        //     for( int k=i; k<height.length;k++){
        //         rmax = Math.max(rmax, height[k]);
        //     }
        //     res += Math.min(lmax,rmax)-height[i];
        // }
        // return res;
        int res =0;
        int n = height.length;
        int[] lmax = new int[n];
        lmax[0] = height[0];
        int[] rmax = new int[n];
        rmax[n-1]= height[n-1];
        
        for( int i=1; i<n ; i++){
            lmax[i]= Math.max(lmax[i-1],height[i]);
        }
        for( int i= n-2;i>=0; i--){
            rmax[i] = Math.max(rmax[i+1],height[i]);
        }
        
        for( int i=1; i< n-1; i++){
            res += Math.min(lmax[i],rmax[i]) - height[i];
        }
        return res;
    }
}