class Solution {
    /*Intuition:
    - maintain three hashset of int[] arrays, loop through grid in n2 time. add row wise elem to rows set , col wise to cols set and for squares , treat each square as index 0 to 9: compute index = (i/3)*3 + ( j / 3)
    */
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows[] = new Set[9];
        Set<Character> cols[] = new Set[9];
        Set<Character> squares[] = new Set[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }

                if (rows[i].contains(c) || 
                    cols[j].contains(c) || 
                    squares[(i / 3) * 3 + j / 3].contains(c)
                    ) {
                        return false;
                }

                rows[i].add(c);
                cols[j].add(c);
                squares[(i / 3) * 3 + j / 3].add(c);
            }
        }
        
        return true;
    }
}