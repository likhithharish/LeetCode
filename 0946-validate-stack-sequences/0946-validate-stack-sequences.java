class Solution {
    // three scenarios :
    // No elem in stack : add till popped[i] and mark popped[i] in pushed as lastRemovedIndex.
    // Stack not contains curr elm : loop in pushed from lastRemovedIndex+1 to till curr elem location in pushed and add missing elem in stack.
    // stack contains elem : pop and see if its same.
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int lastRemovedIndex = 0;
        for(int i=0; i<popped.length;i++){
            if(st.isEmpty()){
                for(int j=0;j<pushed.length; j++){
                    if(pushed[j]== popped[i]){
                        lastRemovedIndex = j;
                        break;
                    }
                    st.push(pushed[j]);
                }
            }else if(!st.contains(popped[i])){
                for(int j=lastRemovedIndex+1; j<pushed.length; j++){
                    if(pushed[j]== popped[i]){
                        lastRemovedIndex = j;
                        break;
                    }
                    if(!st.contains(pushed[j]) ){
                        st.add(pushed[j]);
                    }
                }
            }else{
                int r = st.pop();
                if(r != popped[i]){
                    return false;
                }   
            } 
        }
        return true;
    }
}