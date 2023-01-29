public class SearchIn2DMatrix{
    // complexity O(N*M)
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] <= target || matrix[i][n-1] >= target){
                for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
