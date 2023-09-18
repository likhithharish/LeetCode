class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< mat.length; i++){
            int count =0;
            for(int j=0; j< mat[0].length; j++){
                if(mat[i][j]==1){
                    count++;
                }else{
                    break;
                }
            }
            map.put(i, count);
        }
        //System.out.println(map);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Custom Comparator
        Comparator<Map.Entry<Integer, Integer>> customComparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                int valueCompare = entry1.getValue().compareTo(entry2.getValue());

                if (valueCompare == 0) {
                    return entry1.getKey().compareTo(entry2.getKey());
                }

                return valueCompare;
            }
        };

        Collections.sort(list, customComparator);

        HashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        int[] res = new int[k];
        int index = 0;
        //System.out.println(sortedMap);
        for(Map.Entry<Integer, Integer> e: sortedMap.entrySet()){
                if(index > k-1){
                    return res;
                }
                res[index] = e.getKey();
                index++;
        }
        
        return res;
        
    }
}