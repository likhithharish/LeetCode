class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(target);
        int index =0;
        for(int i=1; i<=n && index<target.length; i++){
            if(i== target[index]){
                list.add("Push");
                index += 1;
            }else{
                list.add("Push");
                list.add("Pop");
            }
            
        }
        return list;
    }
}