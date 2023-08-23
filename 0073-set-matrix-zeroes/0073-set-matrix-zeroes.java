class Solution {
    // Naive Impl: Mark the index of zeros an make all elem in its row and col as 0.
    public void setZeroes(int[][] matrix) {
//         List<String> list = new ArrayList<>();
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j]==0){
//                     list.add(i+","+j);
//                 }
//             }
//         }

//         for(String s: list){
//             String[] str = s.split(",");
//             int i= Integer.valueOf(str[0]);
//             int j = Integer.valueOf(str[1]);
//             int x =0, y=0;
//             while(x<matrix.length){
//                 matrix[x][j] =0;
//                 x++;
//             }
//             while(y<matrix[0].length){
//                 matrix[i][y] =0;
//                 y++;
//             }
//         }
        
        // Approach 2: Mark the first of column and row as 0 , if element is 0. then make that specific row and column 0.
        boolean firstCol = false;
        for(int i=0; i< matrix.length; i++){
            if(matrix[i][0] ==0){
                firstCol = true;
            }
            for(int j=1; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }
            }
        }
        
        // modify matrix from second row and col
        for(int i=1; i< matrix.length; i++){
            for(int j=1; j< matrix[0].length; j++){
                if(matrix[i][0] ==0 || matrix[0][j]==0){
                    matrix[i][j] =0;
                }
            }
        }
        
        // modify first row?
        if(matrix[0][0] ==0){
            for(int i=0; i< matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        
        //modify first col?
        if(firstCol){
            for(int i=0;i< matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
      
    }
}