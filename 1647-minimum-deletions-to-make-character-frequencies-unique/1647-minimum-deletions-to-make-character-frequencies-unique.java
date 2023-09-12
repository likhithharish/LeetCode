
class Solution {
    public int minDeletions(String s) {
        int[] counts = new int[26];
        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i) -'a']++;
        }
        int res = 0;
        HashSet<Integer> seenFreq = new HashSet<>();
        for(int i=0; i< counts.length; i++){
            while(counts[i]>0 && seenFreq.contains(counts[i])){
                counts[i]--;
                res++;
            }
            seenFreq.add(counts[i]);
        }
        
        return res;
    }
}