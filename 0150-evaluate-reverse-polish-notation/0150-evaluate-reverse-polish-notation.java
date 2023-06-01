class Solution {
    /*
    Intuition:
    - If its number, push it. if not 
    */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for( int i=0; i<tokens.length;i++){
            if(!"+-*/".contains(tokens[i])){
                stack.add(Integer.parseInt(tokens[i]));
            }else{
                int i1 = stack.pop();
                int i2 = stack.pop();
                
                if(tokens[i].equals("+")){
                    i1 = i1 + i2;
                    stack.add(i1);
                }else if(tokens[i].equals("*")){
                    i1 = i1 * i2;
                    stack.add(i1);
                }else if(tokens[i].equals("/") && i1!=0){
                    i1= i2 /i1;
                    stack.add(i1);
                }else{
                    i1=i2-i1;
                    stack.add(i1);
                }
            }
        }
        return stack.pop();
    }
    
   
}