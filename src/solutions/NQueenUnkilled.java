package solutions;

public class NQueenUnkilled {
    public static void main(String[] args) {
        nQueenPermutation(new boolean[4][3], 0, 0, 0, 3, "");
    }
    public static void nQueenPermutation(boolean[][] board, int row,int col, int placedQueen, int totalQueen, String ans){
        if(totalQueen==placedQueen){
            System.out.println(ans);
            return;
        }
        if(col==board[row].length){
            row=row+1;
            col=0;
        }
        if(row == board.length){
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nQueenPermutation(board, row, col + 1, placedQueen + 1, totalQueen, ans + "{" + row + "," + col + "}"); // Select																							// box
            board[row][col] = false;
        }

        nQueenPermutation(board, row, col + 1, placedQueen, totalQueen, ans);
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Check above
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // check left
        for (int j = 0; j < col; j++) {
            if (board[row][j]) {
                return false;
            }
        }
        // Upper left Diagonal
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {

            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Upper right Diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
