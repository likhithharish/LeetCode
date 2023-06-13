class Solution {
    /*
    -Store rows in a map (string, integer).
    - create array of each column and search for it in map nd increment result if found.
    */
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<grid.length; i++){
            String val = Arrays.toString(grid[i]);
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        
        int res =0;
        for(int i=0; i<grid[0].length; i++){
            int[] temp = new int[grid.length];
            int j=0;
            while(j<grid.length){
                temp[j] = grid[j][i];
                j++;
            }
            String key = Arrays.toString(temp);
            if(map.containsKey(key)){
                res += map.get(key);
            }
        }
        return res;
    }
}