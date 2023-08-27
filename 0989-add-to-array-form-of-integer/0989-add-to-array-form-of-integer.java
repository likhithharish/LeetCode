class Solution {
    // Intuition: generate number from num array, compute sum(column wise number by number) and it to a list , reverse the list.
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int carry =0;
        int i = num.length -1;
        while(i>=0 || k>0 || carry>0 ){
            int val = (i>=0) ? num[i--] : 0;
            
            int sum = val + (k%10) + carry;
            res.add(sum %10);
            carry = sum /10;
            k = k/10;
        }
        
        Collections.reverse(res);
        
        return res;
    }
}