class Solution {
    public int countNegatives(int[][] grid) {
        int row = 0;
        int column = 0;
        for(int i = 0; i < grid[0].length; i++) {
            if(grid[0][i] < 0) {
                column = i;
                break;
            }
        }
        column = (column == 0) ? grid[0].length : column;
        for(int j = 0; j < grid.length; j++) {
            if(grid[j][0] < 0) {
                row = j;
                break;
            }
        }
        row = (row == 0) ? grid.length : row;
        int count = 0; // the number of non-negative numbers
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(grid[i][j] >= 0)
                    count++;
            }
        }
        return grid[0].length * grid.length - count;
    }
}