class Solution {
    // Modified version of compute histogram- largest rect.
    // treat each row as such prob and update result.
    // update row based on prev row if the index is 1.
    public int maximalRectangle(char[][] matrix) {
        int res = 0;
        int[] arr = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                arr[j] = (matrix[i][j] == '1') ? arr[j] + 1 : 0;
            }
            res = Math.max(res, computeHeight(arr));
        } 
        return res;
    }
    
    public int computeHeight(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int res =0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >=  heights[i]) {
                int tp = st.pop();
                int curr = heights[tp] * (st.isEmpty() ? i : (i - st.peek() - 1));
                res = Math.max(res, curr);
            }
            st.push(i);
        }
        // Process left over items in stack
        while (!st.isEmpty()) {
            int tp = st.pop();
            int curr =heights[tp] * (st.isEmpty() ? n : (n - st.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
}