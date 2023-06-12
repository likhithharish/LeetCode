class Solution {
    //Find the row and do binary search for element in the row.
    //O(R+C) - start from top right, if elem is greater- go down else go left
    public boolean searchMatrix(int[][] matrix, int target) {
        // for (int i = 0; i < matrix.length; i++) {
        //     int end = matrix[i].length - 1;
        //     int start = 0;
        //     if (target >= matrix[i][start] && target <= matrix[i][end]) {
        //         while (start <= end) {
        //             int mid = (start + end) / 2;
        //             if (matrix[i][mid] == target) {
        //                 return true;
        //             }
        //             if (matrix[i][mid] > target) {
        //                 end = mid - 1;
        //             } else {
        //                 start = mid + 1;
        //             }
        //         }
        //     }
        // }
        // return false;
        
        int bottom = 0, left = matrix[0].length - 1;
        while (left >= 0 && bottom < matrix.length) {
            if (matrix[bottom][left] == target) {
                return true;
            } else if (matrix[bottom][left] > target) {
                left--;
            } else {
                bottom++;
            }
        }
        return false;
    }
}