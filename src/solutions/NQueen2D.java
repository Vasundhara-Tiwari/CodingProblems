package solutions;

public class NQueen2D {
    public static void main(String[] args) {
        nQueenPermutation(new boolean[2][2], 0,0,0,2,"");
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
        nQueenPermutation(board, row,col+1,placedQueen+1, totalQueen, ans+"{"+row+","+col+"}");
        nQueenPermutation(board,row,col+1, placedQueen,totalQueen,ans);
    }
}
