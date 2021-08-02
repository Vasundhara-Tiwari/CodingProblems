package solutions;


//order is considered
public class NQueenPermutations {
    public static void main(String[] args) {
        queenPermutationsBoard(new boolean[4],0,2,"");
    }
    public static void queenPermutationsBoard(boolean[] board, int currentQueen, int totalQueen, String ans){
        if(totalQueen==currentQueen){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<board.length; i++){
            if(board[i]==false) {
                board[i] = true;
                queenPermutationsBoard(board, currentQueen+1,totalQueen, ans+"b"+i+"q"+currentQueen+",");
                board[i]=false;
            }
        }
    }
}
