class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum =0, max =0;
        for(int i=0; i<n; i++){
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
        int res =0;
        int low =max, high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(weights, days, mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return res;
    }
    
    public boolean isFeasible(int[] arr, int days, int ans){
        int req =1, sum =0;
        for(int i=0; i<arr.length; i++){
            if(sum +arr[i]> ans){
                req ++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }
        
        return (req<=days);
    }
}