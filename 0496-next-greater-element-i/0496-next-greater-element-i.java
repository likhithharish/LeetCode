class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i],i);
            
        }
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                for(int j=map.get(nums1[i]); j<nums2.length ; j++){
                    if(nums2[j]>nums1[i]){
                        ans[i] = nums2[j];
                        break;
                    }
                }
                
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}