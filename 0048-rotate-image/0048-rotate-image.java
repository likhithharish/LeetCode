class Solution {
    /*
    intuition: Reverse the rows 0 <-> last , 1<->last-1 ...
    //Transpose the matrix in place.
    */
    public void rotate(int[][] matrix) {
       // Reverse,
        int start = 0, end = matrix.length - 1;
        while (start <= end) {
            for (int i = 0; i < matrix[0].length; i++) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
            }
            start++;
            end--;
        }
        // Transpose
        matrix = transposeInPlace(matrix);
    }
    
    public int[][] transposeInPlace(int[][] arr) {
        // Transpose inplace for a square matrix n *n
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            int end = arr[i].length;
            for (int j = start; j < end; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            start++;
        }
        return arr;
    }
}