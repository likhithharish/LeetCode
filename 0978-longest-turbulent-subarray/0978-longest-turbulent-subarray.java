class Solution {
    /*Intuition:
    - Keep track of prev symbol and compare with curr symbol and increment count accord.
    */
    public int maxTurbulenceSize(int[] arr) {
        int s = 0, e= 1;
        int res =1;
        String prev ="";
        while(e < arr.length){
            if( arr[e-1]>arr[e] && prev!=">"){
                res = Math.max(res, e-s+1);
                e += 1;
                prev = ">";
            }else if( arr[e-1]<arr[e] && prev!="<"){
                res = Math.max(res, e-s+1);
                e += 1;
                prev = "<";
            }else{//Handling equal sign
                e = (arr[e]==arr[e-1]) ? e+1 : e;
                s = e-1;
                prev = "";
            }
        }
        return res;
        
    }
}