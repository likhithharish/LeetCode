class Solution {
    // METHOD 1: Find leftsmallest indices for each elem and keep in array
    // rightsmallest indexes for each elem into another key
    // compute possible area for each elem in heights and update res with maximum.
    // METHOD 2 : Using Single stack to compute area (Notes)
    public int largestRectangleArea(int[] heights) {
//         int res = 0;
//         Stack<Integer> st = new Stack<>();
//         st.push(0);
//         int[] ps = new int[heights.length];// stores indexes of previous smallest
//         ps[0] = -1;
//         for (int i = 1; i < heights.length; i++) {
//             while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
//                 st.pop();
//             }
//             ps[i] = (st.isEmpty()) ? -1 : st.peek();
//             st.push(i);
//         }

//         st.removeAllElements();
//         int[] ns = new int[heights.length];// stores indexes of next smallest
//         st.push(0);
//         for (int i = 1; i < heights.length; i++) {
//             while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
//                 ns[st.peek()] = i;
//                 st.pop();
//             }
//             st.push(i);
//         }
//         while (!st.isEmpty()) {
//             ns[st.peek()] = heights.length;
//             st.pop();
//         }
//         for (int i = 0; i < heights.length; i++) {
//             int curr = heights[i];
//             curr += (i - ps[i] - 1) * heights[i];
//             curr += (ns[i] - i - 1) * heights[i];
//             res = Math.max(curr, res);
//         }
//         return res;
        Stack<Integer> st = new Stack<>();
        int res =0;
        int n = heights.length;
        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int tp = st.pop();
                int curr = heights[tp] * (st.isEmpty() ? i : (i-st.peek()-1));
                res = Math.max(res, curr);
            }
            st.push(i);
        }
        //Process left over items in stack
        while(!st.isEmpty()){
            int tp = st.pop();
            int curr = heights[tp] * (st.isEmpty()? n : (n-st.peek()-1));
            res = Math.max(res, curr);
        }
        return res;
    }
}