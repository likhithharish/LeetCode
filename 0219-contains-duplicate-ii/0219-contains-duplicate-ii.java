class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i=0;i < nums.length;i++){
            if( !map.containsKey(nums[i]) ){
                map.put(nums[i],i);
            }else{
                int temp = map.get(nums[i]);
                if(Math.abs(temp-i)<= k ){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
        
//         for( int i=0; i<nums.length ; i=i+k){
//             if(i>=k){
//                 if(nums[i]==nums[i-k]){
//                     return true;
//                 }
//             }
            
//         }
//         return false;
}
}