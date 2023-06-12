class Solution {
    /*
    - Find minElem and maxElem in matrix.
    - Compute median position from size.
    - Use Binary Search to find midPosition and shift min and max values comparing with medianPosition.IMP : max = mid (when less) - trying to find elem that exists.
    */
    public int matrixMedian(int[][] grid) {
        int c = grid[0].length;
        int r = grid.length;
        int max = grid[0][c - 1], min = grid[0][0];
        for (int i = 0; i < r; i++) {
            min = Math.min(min, grid[i][0]);
            max = Math.max(max, grid[i][c - 1]);
        }
        int medianPos = ((r * c) + 1) / 2;
        while (min < max) {
            int midVal = (min + max) / 2;
            int midPos = 0;
            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(grid[i], midVal) + 1;
                midPos += Math.abs(pos);
            }

            if (midPos < medianPos) {
                min = midVal + 1;
            } else {
                max = midVal;
            }
        }
        return min;
    }
}