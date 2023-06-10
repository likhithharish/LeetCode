class Solution {
    public int countNegatives(int[][] grid) {
        //Naive
        int count =0;
        for(int i=0; i<grid.length; i++){
            for(int j=grid[i].length -1; grid[i][j]<0 && j>0; j--){
                count++;
               
            }
            if(grid[i][0]<0){
                count++;
            }
        }
        return count;//Will get TLE
    }
}