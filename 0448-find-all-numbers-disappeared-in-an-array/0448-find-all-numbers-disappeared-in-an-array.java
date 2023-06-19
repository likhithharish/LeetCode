class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        Arrays.fill(arr,0);
        for( int i: nums){
            arr[i]+= 1;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0 && i!=0){
                res.add(i);
            }
        }
        return res;
    }
}