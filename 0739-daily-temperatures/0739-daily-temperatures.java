class Solution {
    /*
    Intuition:
    - Keep element indexes in stack when stack is empty. 
    - If stack peek is less than curr temp, loop through stack until stack top is larger , and update temperatures array with the index differences.
    */
    
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i< temperatures.length; i++){
            if(st.isEmpty()){
                st.add(i);
            }else{
                while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                    temperatures[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.add(i);
            }
        }
        if(!st.isEmpty()){
            while(!st.isEmpty()){
                temperatures[st.pop()] = 0;
            }
        }
        return temperatures;
    }
}