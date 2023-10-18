class Solution {
    public String reverseWords(String s) {
        String[] vals = s.split(" ");
        //System.out.println(Arrays.toString(vals));
        StringBuilder str = new StringBuilder();
        for(int i= vals.length-1; i>=0; i--){
            
            if(!vals[i].equalsIgnoreCase("")){
                str.append(vals[i]);
                str.append(" ");
            }
            
        }
        String out = str.toString();
        out = out.strip();
        return out;
    }
}