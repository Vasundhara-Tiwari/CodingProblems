package solutions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return al;
        }
        int min_row = 0, max_row = matrix.length - 1;
        int min_col = 0, max_col = matrix[0].length - 1;
        while (true) {
            if (min_col > max_col) {
                break;
            }
            for (int i = min_col; i <= max_col; i++) {
                al.add(matrix[min_row][i] );
            }
            min_row++;
            if (min_row > max_row) {
                break;
            }
            for (int i = min_row; i <= max_row; i++) {
                al.add(matrix[i][max_col]);
            }
            max_col--;
            if (min_col > max_col) {
                break;
            }
            for (int i = max_col; i >= min_col; i--) {
                al.add(matrix[max_row][i]);
            }
            max_row--;
            if (min_row > max_row) {
                break;
            }
            for (int i = max_row; i >= min_row; i--) {
                al.add(matrix[i][min_col]);
            }
            min_col++;
        }
        return al;
    }
}
