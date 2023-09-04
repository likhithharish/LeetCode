class Solution {
    // keep track of visited elements in rows, cols, and each square,(array of hashsets) return false if element exists.
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows[] = new Set[9];
        Set<Character> cols[] = new Set[9];
        Set<Character> sqrs[] = new Set[9];
        
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            sqrs[i] = new HashSet<>();
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if(c== '.'){
                    continue;
                }
                
                if(rows[i].contains(c)|| cols[j].contains(c) ||
                    sqrs[(i/3)*3 + j/3].contains(c) ){
                    return false;
                }
                
                rows[i].add(c);
                cols[j].add(c);
                sqrs[(i/3)*3 + j/3].add(c);
            }
        }
        
        return true;
    }
}