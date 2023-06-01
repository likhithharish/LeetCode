class Solution {
    /*
    Intuition:
    - Cars on largest position will reach first. So sort the array based on first element.
    - Calculate time for car to reach and compare with time value in stack and replace with new time if stack value is greater. ( Car with less time will reach first .)
    */
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1){
            return 1;
        }
        Stack<Double> st = new Stack<>();
        int[][] array = new int[position.length][2];
        
        for( int i=0; i<position.length; i++){
            array[i][0] = position[i];
            array[i][1] = speed[i];
        }
        //Sorting based on first element.
        Arrays.sort(array, java.util.Comparator.comparingInt(a -> a[0]));
        
        for( int i=position.length-1; i>=0; i--){
            double time = (double) (target - array[i][0]) / array[i][1];
            if(!st.isEmpty() && time<=st.peek()){
                continue;
            }else{
                st.push(time);
            }
        }
        
        return st.size();
        
    }
}