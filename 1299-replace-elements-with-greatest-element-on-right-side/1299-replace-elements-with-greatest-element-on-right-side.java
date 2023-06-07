class Solution {
    public int[] replaceElements(int[] arr) {
        int[] temp = new int[arr.length];
        temp[arr.length-1] = -1;
        for( int i=arr.length-2; i>=0; i--){
            temp[i] = Math.max(temp[i+1],arr[i+1]);
        }
        return temp;
    }
}