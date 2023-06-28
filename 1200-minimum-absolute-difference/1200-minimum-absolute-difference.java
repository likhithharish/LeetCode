class Solution {
    //Sort and find the minDifference and loop through again and return the pairs.
    //Modify with sort and one traversal - find mindiff and pairs in one .
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            if(Math.abs(arr[i]-arr[i-1])==minDif){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(Math.abs(arr[i]-arr[i-1]) <minDif){
                minDif = Math.abs(arr[i]-arr[i-1]);
                res.clear();
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}