class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // for( int i=0; i< temperatures.length; i++){
        //     int temp = temperatures[i];
        //     for( int j=i+1; j< temperatures.length; j++){
        //         if(temperatures[j]>temperatures[i]){
        //             temperatures[i] = j-i;
        //             break;
        //         }
        //     }
        //     if(temperatures[i]== temp){
        //         temperatures[i]=0;
        //     }
        // }
        // return temperatures;
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for( int i=0; i< temperatures.length; i++){
            
            while(!st.isEmpty() && temperatures[st.peek()]< temperatures[i] ){
                int prev = st.pop();
                ans[prev] = i - prev;
                
            }
            st.add(i);
        }
        
        
        return ans;
    }
}