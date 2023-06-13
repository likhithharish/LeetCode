class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList(Arrays.asList(1)));
        if(numRows==1){return res;}
        res.add(new ArrayList(Arrays.asList(1,1)));
        if(numRows==2){return res;}
        
        for(int i=3; i<=numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<i; j++){
                if(j==0){
                    temp.add(1);
                }else if(j==i-1){
                    temp.add(1);
                    res.add(temp);
                }else{
                    temp.add( res.get(i-2).get(j)+res.get(i-2).get(j-1) ) ;
                }
            }
        }
        return res;
    }
}