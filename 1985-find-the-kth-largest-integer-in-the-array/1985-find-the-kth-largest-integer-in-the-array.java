class StringComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        if(s1.length() != s2.length()){
            return s1.length() - s2.length();
        }
        
        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1==c2){continue;}
            return (c1-c2);
        }
        return 0;
    }
}

class Solution {
    // Converting String to int will give numformatexception for large strings.
    // Optimised approach: Use a heap with custom comparator
    
    public String kthLargestNumber(String[] nums, int k) {
       
       PriorityQueue<String> pq = new PriorityQueue<>(new StringComparator());
        
        for(String s: nums){
            pq.add(s);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}