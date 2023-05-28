class Solution {
    /*
    Intuition:
    - Naive : Merge two arrays and perform sort.
    - Two Pointer :Make new array copy of nums1 , move values to nums1 by comparing num2 and copy array .
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Naive Solution 
        // for( int i=m; i<nums1.length; i++){
        //     nums1[i] = nums2[i-m];
        // }
        // Arrays.sort(nums1);
        int[] copy = new int[m];
        for( int i=0; i<m; i++){
            copy[i] = nums1[i];
        }
        int p1 = 0;
        int pc1 = 0, p2=0;
        while(pc1<m && p2<n){
            if(copy[pc1]<=nums2[p2]){
                nums1[p1] = copy[pc1];
                pc1++;           
            }else if(copy[pc1]>nums2[p2]){
                nums1[p1] = nums2[p2];
                p2++;  
            }
            p1++;
        }
        if(pc1!=m){
            //move rest of copy to num1
            for( int i=p1; i<(m+n); i++){
                nums1[i] = copy[pc1];
                pc1++;
            }
        }else{
            for( int i=p1; i<(m+n); i++){
                nums1[i] = nums2[p2];
                p2++;
            }
        }
    }
}