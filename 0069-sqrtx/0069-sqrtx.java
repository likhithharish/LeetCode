class Solution {
    public int mySqrt(int x) {
        long sq;
        int low = 0, high = x, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            sq = (long) mid * mid; // use long
            if (sq == x) {
                return mid;
            } else if (sq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}