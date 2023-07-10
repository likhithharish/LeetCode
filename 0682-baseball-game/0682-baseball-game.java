class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();
        int result =0;
        for(String s: operations){
            if(isInteger(s)){
             st.push(s);   
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int prev = Integer.valueOf(st.peek());
                prev = 2 * prev;
                st.push(String.valueOf(prev));
            }else{
                int val1 = Integer.valueOf(st.pop());
                int val2 = Integer.valueOf(st.peek());
                st.push(String.valueOf(val1));
                result = val1 + val2;
                st.push(String.valueOf(result));
            }
        }
        result =0;
        while(!st.isEmpty()){
            result += Integer.valueOf(st.pop());
        }
        return result;
    }
    
    public boolean isInteger(String s){
        try{
            int k = Integer.valueOf(s);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}