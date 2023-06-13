class Solution {
    public int countNegatives(int[][] grid) {
        // Solution 1: Find the sub-matrix where non-negative numbers could be located
        // int row = 0;
        // int column = 0;
        // for(int i = 0; i < grid[0].length; i++) {
        //     if(grid[0][i] < 0) {
        //         column = i;
        //         break;
        //     }
        // }
        // column = (column == 0) ? grid[0].length : column; // column == 0 : no negative number in the first row
        // for(int j = 0; j < grid.length; j++) {
        //     if(grid[j][0] < 0) {
        //         row = j;
        //         break;
        //     }
        // }
        // row = (row == 0) ? grid.length : row; // row == 0 : no negative number in the first column
        // int count = 0; // the number of non-negative numbers
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < column; j++) {
        //         if(grid[i][j] >= 0) // get the number of non-nagative numbers
        //             count++;
        //     }
        // }
        // return grid[0].length * grid.length - count; // return the number of positive numbers

        // Solution 2: Traverse the matrix from the first row, the rightmost column
        int row = 0; // start from the first row
        int column = grid[0].length - 1; // start from the rightmost column
        int count = 0; // the counter used to count the negative numbers
        // Key point here: Once there is a negative number, it means that the numbers below it are all negatives
        while(row <= grid.length - 1 && column >= 0) {
            if(grid[row][column] < 0) {
                count += grid.length - row; // the total number of rows minus the above number of rows
                column--;
            } else { // grid[row][column] >= 0
                row++;
            }
        }
        return count;
    }
}