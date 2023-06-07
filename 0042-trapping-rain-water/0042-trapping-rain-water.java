class Solution {
    /*
    Intuition:
    - At a given index, u can fill water to a max height (specified by its boundary either on left or right maximum value) - its value.
    */
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        int rightMax = height[height.length - 1];
        int res = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            int val = Math.min(leftMax[i], rightMax) - height[i];
            res += (val > 0) ? val : 0;
            rightMax = Math.max(height[i], rightMax);
        }
        return res;
    }
}