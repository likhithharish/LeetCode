class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        int count =0;
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '*'){
                count++;
                continue;
            }else if(count>0){
                count--;
                continue;
            }else{
                res.append(String.valueOf(s.charAt(i)) );
            }
        }
        
        return res.reverse().toString();
    }
}