class Solution {
    // At each index, compute leftMax and rightMax and water that can fill at that position will Min(leftMax, rightMax) - height[i]. Compute sum result for each index and return it.
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        leftMax[0] = -1;
        for(int i=1; i<leftMax.length; i++){
            leftMax[i] = Math.max(height[i-1], leftMax[i-1]);
        }
        
        int rightMax = -1;
        int ans = 0;
        for(int i=leftMax.length-1; i>=0; i--){
            if(Math.min(leftMax[i], rightMax) - height[i] >0){
                ans += Math.min(leftMax[i], rightMax) - height[i];
            }
            rightMax = Math.max(rightMax, height[i]);
            
        }
        return ans;
    }
}