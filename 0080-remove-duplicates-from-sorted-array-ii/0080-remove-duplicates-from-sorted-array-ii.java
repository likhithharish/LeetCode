class Solution {
    /*
    Intuition:
    - Basic : mark the non duplicate elem index in a list , and place the list index values first in temp array and then into nums
    */
    public int removeDuplicates(int[] nums) {
        int res =0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int curr = nums[0];
        int count = 1;
        for( int i=1; i<nums.length; i++){
            //System.out.println(i+": "+nums[i]+","+curr+","+count);
            if(nums[i]==curr && count<2){
                list.add(i);
                count++;
            }else if(nums[i]==curr && count>=2){                
                res++;
            }else{
                list.add(i);
                curr = nums[i];
                count = 1;
            }
        }
        //System.out.println(list);
        int[] temp = new int[nums.length];
        for( int i=0; i<list.size(); i++){
            temp[i] = nums[list.get(i)];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = temp[i];
        }
        return nums.length - res;
            
    }
}