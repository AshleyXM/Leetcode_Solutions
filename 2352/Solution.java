class Solution {
    public int equalPairs(int[][] grid) {
        int row = 0;
        int count = 0; // the final result
        int n = grid.length; // the size of the matrix
        while(row < n) { // row: 0 -> n - 1
            int column = 0;
            while(column < n) { // column: 0 -> n - 1
                int pointer = 0;
                while(pointer < n) { // pointer: 0 -> n - 1
                    if(grid[row][pointer] != grid[pointer][column]) {
                        break;
                    } else {
                        pointer++;
                    }
                }
                if(pointer == n) { // all the element in the current row and column are the same, then count + 1
                    count++;
                }
                column++; // move to the next column
            }
            row++; // move to the next row
        }
        return count;
    }
}