class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int end = matrix[i].length - 1;
            int start = 0;
            if (target >= matrix[i][start] && target <= matrix[i][end]) {
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    }
                    if (matrix[i][mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}