class Solution {
    public void setZeroes(int[][] matrix) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    list.add(i+","+j);
                }
            }
        }

        for(String s: list){
            String[] str = s.split(",");
            int i= Integer.valueOf(str[0]);
            int j = Integer.valueOf(str[1]);
            int x =0, y=0;
            while(x<matrix.length){
                matrix[x][j] =0;
                x++;
            }
            while(y<matrix[0].length){
                matrix[i][y] =0;
                y++;
            }
        }
      
    }
}