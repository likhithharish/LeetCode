class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int pt = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > nums2[pt]) {
                int temp = m;
                while (temp > i) {
                    int tempVal = nums1[temp];
                    nums1[temp] = nums1[temp - 1];
                    nums1[temp - 1] = tempVal;
                    // System.out.println("TEMP: " + temp);
                    // displayArray(nums1);
                    temp--;
                }
                nums1[temp] = nums2[pt];
                m++;
                pt++;
                if (pt == n) {
                    break;
                }
            } else if (i>=m && nums1[i] == 0) {
                nums1[i] = nums2[pt];
                pt++;
                if (pt == n) {
                    break;
                }
            }
        }
    }
}