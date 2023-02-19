package solutions;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku{
    public boolean isValidSudoku(char[][] board) {
        Set<String> visited = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                
                if(!visited.add(String.valueOf(board[i][j]) + " in row " + i) || !visited.add(String.valueOf(board[i][j]) + " in col " + j) || !visited.add(String.valueOf(board[i][j]) + " in box " + i/3 + "-" + j/3)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
