class Solution {
    //keep in a map of all char and their counts, start from char b and dec count, whenever char is not present or value not >0. return count.
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: text.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        String res = "balloon";
        int count =0;
        while(map.get('b')!= null && map.get('b')>0){
            for(char c: res.toCharArray()){
                if(map.get(c)!=null && map.get(c)>0){
                    map.put(c, map.get(c)-1);
                }else{
                    return count;
                }
            }
            count++;
        }
        
        return count;
    }
}