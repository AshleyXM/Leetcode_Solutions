class Solution {
    public void rotate(int[][] matrix) {
        // upside down
        for(int row = 0; row < matrix.length/2; row++) {
            for(int col = 0; col < matrix.length; col++) {
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - row - 1][col];
                matrix[matrix.length - row - 1][col] = tmp;
            }
        }
        // reverse along the diagonal
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < row; col++) {
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = tmp;
            }
        }
    }
}