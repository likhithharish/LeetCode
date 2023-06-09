class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length==1){
            return arr.length;
        }
        if(arr.length==2){
            return (arr[0]==arr[1]) ? 1 :2;
        }
        int count =0;
        String sign = "";
        int res = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            String temp = sign;
            if(arr[i]>arr[i-1]){
                sign =">";
            }else if(arr[i]<arr[i-1]){
                sign ="<";
            }else{
                sign="";
                continue;
            }
            if( (temp==">" && sign=="<") || (temp=="<"&& sign==">")){
                if(count==0){ count+=2;}
                else{ count+= 1;}
            }else{
                count =0;
            }
            res = Math.max(res, count);
        }
        if(res==0){res =1;}
        if(res == Integer.MIN_VALUE){return 1;}
    return res+1;
    }
}