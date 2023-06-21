class Solution {
    //Use a sliding window of size k and add new index val and sub first index of last subarray
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0; 
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int res = (sum/k)>=threshold? 1 : 0;
        int i=0, j=k;
        while(i<arr.length && j<arr.length){
            sum = sum + arr[j] - arr[i];
            if(sum/k >= threshold){ res +=1;}
            i++;
            j++;
        }
        return res;
    }
}