class Solution {
    // Appraoch 1 : Sort and return (n-k)th element. (Not efficient) (nlogn)
    // Approach 2: Quick select (cant use arrays directly, modify to list to reduce)
    public int findKthLargest(int[] nums, int k) {
       List<Integer> vals = new ArrayList<>();
        for(int i: nums){
            vals.add(i);
        }
        return quickSelect(vals, k);
    }
    
    public int quickSelect(List<Integer> nums, int k){
        int p =  nums.size()-1;
        int pivot = nums.get(p);
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        
        for(int i: nums){
            if(i > pivot){
                left.add(i);
            }else if( i< pivot){
                right.add(i);
            }else{
                mid.add(i); // duplicates to pivot value
            }
        }
        
        if(k <= left.size()){
            return quickSelect(left, k);
        }
        
        
        if(left.size() + mid.size() < k){
            return quickSelect(right, k - left.size() - mid.size());
        }
        return pivot;
    }
}