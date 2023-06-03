class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int result = 0;
        boolean found = false;
        for( int i=0; i< haystack.length(); i++){
            if(haystack.charAt(i) ==needle.charAt(0)){
                result =i;
                System.out.println("r:: "+result);
                int k=0;
                for( int j=i; j<haystack.length() && k<needle.length(); j++){
                    if(haystack.charAt(j) != needle.charAt(k)){
                        found = false;
                        break;
                    }else{
                        found = true;
                    }
                    k++;
                }
                if(found == true){
                    break;
                }
            }
        }
        
        return result;
        
    }
}