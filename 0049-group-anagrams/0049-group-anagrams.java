class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<List<String>>();
        List<Integer> done = new ArrayList<>();
        
        for( int i=0;i<strs.length;i++){
            List<String> temp = new ArrayList<>();
            if(!done.contains(i)){
                temp.add(strs[i]);
                for( int j=i+1;j<strs.length;j++){
                    if(isAnagram(strs[i],strs[j])){
                        done.add(i);
                        done.add(j);
                        temp.add(strs[j]);
                    }
                }
                results.add(temp);
            }
        }
        return results; // Basic Approach
        
     
    }
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        for( int i=0; i<s.length() ; i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        
        for( int i: count){ if(i!=0){return false;} }
        
        return true;
    }
}