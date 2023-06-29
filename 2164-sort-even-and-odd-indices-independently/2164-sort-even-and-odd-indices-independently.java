class Solution {
    //Basic seperate even and odd indices values and sort them , then keep them back into the array.
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int e=0, o=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = even.get(e);
                e++;
            }else{
                nums[i] = odd.get(o);
                o++;
            }
        }
        return nums;
    }
}