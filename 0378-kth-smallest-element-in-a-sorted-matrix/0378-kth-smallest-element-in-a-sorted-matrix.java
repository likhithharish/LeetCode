class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] arr = new int[matrix.length * matrix.length];
        int index =0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                arr[index] = matrix[i][j];
                index++;
            }
        }
        
        //Use lometo find the kth elem
        int l=0, h= arr.length-1;
        
        while (l <= h) {
            int p = lometoParition(arr, l, h);
            if (p == k - 1) {
                return arr[p];
            }
            if (p > k - 1) {
                h = p - 1;
            } else if (p < k - 1) {
                l = p + 1;
            }
        }
        return -1;
    }
    
    public int lometoParition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i= l-1;
        for(int j=l; j<=h-1; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
}