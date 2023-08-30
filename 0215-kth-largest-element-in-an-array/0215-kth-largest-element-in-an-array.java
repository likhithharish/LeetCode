class Solution {
    // Appraoch 1 : Sort and return (n-k)th element. (Not efficient) (nlogn)
    // Approach 2: Quick select (cant use arrays directly, modify to list to reduce)
    // Approach 3: using Min heap - add each num and if size is more than k , remove first, finally return the peek.
    
    public int findKthLargest(int[] nums, int k) {
        //APproach 2:
       // List<Integer> vals = new ArrayList<>();
       //  for(int i: nums){
       //      vals.add(i);
       //  }
       //  return quickSelect(vals, k);
        
        // Approach 3:
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i: nums){
        //     pq.add(i);
        //     if(pq.size() > k){
        //         pq.poll();
        //     }
        // }
        // return pq.peek();
        
        // Approach 4: Counting sort (modified)
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        int[] counts = new int[max - min+1];
        for(int i: nums){
            counts[i - min] += 1;
        }
        
        // iterate counts from last and decrement k;
        for(int i= counts.length -1; i>= 0; i--){
            k -= counts[i];
            if(k<=0){
                return i+min;
            }
        }
        return -1;
    }
    
    public int quickSelect(List<Integer> nums, int k){
        int p =  nums.size()-1;
        int pivot = nums.get(p);
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        
        for(int i: nums){
            if(i > pivot){
                right.add(i);
            }else if( i< pivot){
                left.add(i);
            }else{
                mid.add(i); // duplicates to pivot value
            }
        }
        
        if(k <= right.size()){
            return quickSelect(right, k);
        }
        
        if(right.size() + mid.size() < k){
            return quickSelect(left, k - right.size() - mid.size());
        }
        return pivot;
    }
}