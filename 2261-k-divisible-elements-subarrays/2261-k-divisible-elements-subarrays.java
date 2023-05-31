class Solution {
    /*
    Intuition:
    - Basic : Run two loops , second loop runs from index's next element to end, check divCount regularly and add new lists to the result.
    - Issue : For large array length , gets TLE.
    - Improvised : modify above approach by using a HashSet and Stringbuilder.
    */
    public int countDistinct(int[] nums, int k, int p) {
//         List<List<Integer>> result = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             //System.out.println("Result: "+result);
//             int divCount = 0;
//             if (nums[i] % p == 0) {
//                 divCount++;
//             }

//             List<Integer> temp = new ArrayList<>();
//             temp.add(nums[i]);
//             if (!result.contains(temp)) {
//                 result.add(new ArrayList<>(temp));
//             }
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] % p == 0) {
//                     divCount++;
//                 }
//                 if(divCount>k){
//                     continue;
//                 }
//                 temp.add(nums[j]);
//                 if (!result.contains(temp)) {
//                     result.add(new ArrayList<>(temp));
//                 }
//             }
//             // System.out.println("Temp:"+i+" :"+temp);
            
//         }
        
//         return result.size();
        HashSet<String> set = new HashSet<>();
        
        for( int i=0; i<nums.length; i++){
            int count = 0;
            StringBuilder sb = new StringBuilder();
            
            for( int j=i; j<nums.length; j++){
                if(nums[j] %p==0){count++;}
                if(count>k){break;}
                
                sb.append(nums[j]+",");
                set.add(sb.toString());
            }
        }
        //System.out.println(set);
        return set.size();
    }
}