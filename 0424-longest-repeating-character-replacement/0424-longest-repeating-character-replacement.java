class Solution {
    /* Sliding window + hash map (count table)
    - Start window 0,0 ; incrment it and simulateneously update the count. 
    length of window - maxOccurancesElement < k then increase the window. else decrease the window and decrement the count of char.
    */
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int max = 0;
        int i=0;
        int res = 0;
        for( int j=0; j<s.length(); j++){
            counts[s.charAt(j) - 'A']++;
            max = Math.max(max, counts[s.charAt(j)-'A']);
            if(j-i +1 -max >k){
                //decrease the window and the count of alphabet
                counts[s.charAt(i) -'A']--;
                i++;
            }
            res = Math.max(res, j-i+1);
        }
        return res;
    }
}