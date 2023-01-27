class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for( char c: s.toCharArray()){
            if( c=='('){
                st.add(')');
            }else if(c=='['){
                st.add(']');
            }else if(c=='{'){
                st.add('}');
            }else{
                if(st.isEmpty() || st.pop() != c){
                    return false;
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
}