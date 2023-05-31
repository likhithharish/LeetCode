class Solution {
    /*
    Intuition:
    - Basic Naive : Remove the character from string and convert to Integer and update until u found a maximum value and return it. Issue - beyond specific length of string cant be converted to int.
    - Improvised - form new string after removing the character and use String comparision and update the result.
    */
    public String removeDigit(String number, char digit) {
        int index =0;
        String res = "";
        for( int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                String temp = number.substring(0,i) + number.substring(i+1);
                if(temp.compareTo(res)>0){
                    res = temp;
                }
            }
        }
        
        return res;
    }
}