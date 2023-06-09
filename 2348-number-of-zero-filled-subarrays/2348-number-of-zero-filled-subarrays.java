class Solution {
    public long zeroFilledSubarray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        long res = 0;
        for(int i=0; i<nums.length; i++){
            sum = (sum==0) ? nums[i] : sum+nums[i] ;
            if(map.containsKey(sum) && nums[i]==0){
                res += (long) map.get(sum);
                map.put(sum , map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return res;
    }
}