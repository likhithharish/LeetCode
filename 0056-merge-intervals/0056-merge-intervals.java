class Solution {
    /*
    Intuition:
    - Sort the 2D array based on first element.
    - Compare curr arr and prev arr and merge them . Keep the merged array on right side. Mark prev arr to avoid adding to output.
    */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, java.util.Comparator.comparingInt(a -> a[0]));
        for( int i=1; i<intervals.length ; i++){
            if(intervals[i][0] <= intervals[i-1][1]){
                if(intervals[i][1]<=intervals[i-1][1]){
                    intervals[i][0] = intervals[i-1][0];
                    intervals[i][1] = intervals[i-1][1];
                }else{
                    intervals[i][0] = intervals[i-1][0];    
                }
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
            }
        }
        ArrayList<int[]> result = new ArrayList<>();
        for(int i=0; i< intervals.length; i++){
            if(intervals[i][0] != -1 ){
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        int[][] out = new int[result.size()][2];
        for( int i=0; i<result.size(); i++){
            out[i][0] = result.get(i)[0];
            out[i][1] = result.get(i)[1];
        }
        return out;
    }
}