class Solution {
    /*
    Intuition:
    - Basic : Keep the card value as key and index as value in a map. If key is already present, calculate the distance and update the key's value with new index. Keep the distance result by comparing to contain minmum always.
    */
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for( int i=0; i<cards.length; i++){
            if(map.containsKey(cards[i])){
                res = Math.min( res, i-map.get(cards[i])+1);
                map.put(cards[i],i);
            }else{
                map.put(cards[i],i);
            }
        }
        return (res==Integer.MAX_VALUE) ? -1 : res;
    }
}