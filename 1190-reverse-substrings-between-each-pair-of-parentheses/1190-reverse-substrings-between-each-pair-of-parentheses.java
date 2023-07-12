class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }else{
                StringBuilder str = new StringBuilder();
                while(st.peek()!='('){
                    str.append(st.pop());
                }
                st.pop();
                for(int j=0; j<str.length(); j++){
                    st.push(str.charAt(j));
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}