class Solution {
    /*
    Intuition:
    - We need to maximise the area. So start with both end points.
    - calculate the result and keep it to update with max value .
    - if height of left index is less, increment it , else decrement right . till both meet.
    */
    public int maxArea(int[] height) {
        int result = 0;
        int start =0, end = height.length -1;
        while(start< end){
            result = Math.max(result, Math.min(height[start],height[end])*(end-start) );
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        
        return result;
    }
}