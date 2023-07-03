class Solution {
    /*
    - keep a sliging window i(left, j(right). keep track of char index in a map and if char already exists in map , check  if left point is not ahead of prev char index , move left point to new char index +1 and update in map. (corner case - left point check 'abba')
    */
    public int lengthOfLongestSubstring(String s) {
     int n = s.length();
        int res = 0;
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[s.charAt(j)] + 1);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);
            prev[s.charAt(j)] = j;
        }
        return res;
    }
}