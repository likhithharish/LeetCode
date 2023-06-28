class Solution {
    //Sort and find the minDifference and loop through again and return the pairs.
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        for(int i=1; i<arr.length;i++){
            minDif = Math.min(minDif, Math.abs(arr[i]- arr[i-1]));
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            if(Math.abs(arr[i]-arr[i-1])==minDif){
                List<Integer> temp = Arrays.asList(arr[i-1],arr[i]);
                res.add(temp);
            }
        }
        return res;
    }
}