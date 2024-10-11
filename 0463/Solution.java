class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) { // 因为只有一个island，所以只会为true一次
                    perimeter += getCellPerimeter(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    public int getCellPerimeter(int[][] grid, int row, int col) {
        if(!inArea(grid, row, col)) return 1;
        if(grid[row][col] == 2) return 0;
        if(grid[row][col] == 0) return 1;
        grid[row][col] = 2;
        return getCellPerimeter(grid, row - 1, col) + 
                getCellPerimeter(grid, row + 1, col) + 
                getCellPerimeter(grid, row, col - 1) + 
                getCellPerimeter(grid, row, col + 1);
    }

    public boolean inArea(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length;
    }
}