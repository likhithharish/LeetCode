class Solution {
    // Method 1 - use hashmap to record nums2 ( val,i), then for each val in nums1, find index of it in nums2 using map and get the next greatest value after it.
    // Method 2 - use stack in addition with map.
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i],i);
            
        }
        //Part of method 1
//         int[] ans = new int[nums1.length];
//         Arrays.fill(ans, -1);
//         for(int i=0; i<nums1.length; i++){
//             if(map.containsKey(nums1[i])){
//                 for(int j=map.get(nums1[i]); j<nums2.length ; j++){
//                     if(nums2[j]>nums1[i]){
//                         ans[i] = nums2[j];
//                         break;
//                     }
//                 }
                
//             }else{
//                 ans[i] = -1;
//             }
//         }
//         return ans;
        //Method 2
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[st.peek()] <= nums2[i]) {
                nums2[st.peek()] = nums2[i];
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nums2[st.peek()] = -1;
            st.pop();
        }
        
        for(int i=0; i< nums1.length; i++){
            nums1[i] = nums2[map.get(nums1[i])];
        }
        return nums1;
    }
}