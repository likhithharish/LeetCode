class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:nums){
        //     if(!map.containsKey(num)){
        //         map.put(num,1);
        //     }else{
        //         map.put(num,map.get(num)+1);
        //     }
        // }
        // int max = Integer.MIN_VALUE;
        // int result = 0;
        // for (Map.Entry<Integer, Integer> e : map.entrySet()){
        //     if(e.getValue()>max){
        //         max = e.getValue();
        //         result = e.getKey();
        //     }
        // }
        // return result;
        Arrays.sort(nums);
        int curr = nums[0];
        int count =1;
        int res = 0;
        int totalMaxElem = nums[0];
        for( int i=1; i< nums.length; i++){
            if(nums[i]==curr){
                count++;
                if(count>res){
                    totalMaxElem = curr;
                }
                res = Math.max(res,count);
            }else{
                if(count>res){
                    totalMaxElem = curr;
                }
                curr = nums[i];
                res = Math.max(res,count);
                count =1;
            }
        }
        return totalMaxElem;
    }
}