class Solution {
    // Run two nested loops from 1 to 9, frame sequential numbers and it to res, sort the res and return it.
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i=1; i<=9; i++){
            int num =i;
            for(int j=i+1; j<=9;j++){
                num = (num*10)+j;
                if(num>=low && num<=high){
                    res.add(num);
                }
                if(num>high){
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}