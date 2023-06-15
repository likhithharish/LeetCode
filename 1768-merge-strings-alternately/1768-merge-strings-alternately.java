class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char[] res = new char[word1.length() + word2.length()+1];
        Arrays.fill(res, ' ');
        int i=0;
        int n = Math.min(word1.length(), word2.length());
        int j= 0, k=0;
            for(; j<n; j++){
                res[i] = word1.charAt(j);
                i+= 2;
            }
            i=1;
            for(; k<n; k++){
                res[i] = word2.charAt(k);
                i+= 2;
            }
        i-=1;
        if(word1.length()> word2.length()){
            for(int l=j; l<word1.length(); l++){
                res[i] = word1.charAt(l);
                i++;
            }
        }else{
            for(int l=k; l<word2.length(); l++){
                res[i] = word2.charAt(l);
                i++;
            }
        }
        
        String out = String.valueOf(res).replace(" ","");
        return out.toString();
    }
}