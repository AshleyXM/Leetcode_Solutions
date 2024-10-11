class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, getMaxArea(grid, i, j));
            }
        }
        return max;
    }

    public int getMaxArea(int[][] grid, int row, int col) {
        if(!inArea(grid, row, col)) return 0;
        if(grid[row][col] != 1) return 0;
        grid[row][col] = 2;
        return 1 + getMaxArea(grid, row - 1, col)
                + getMaxArea(grid, row + 1, col)
                + getMaxArea(grid, row, col - 1)
                + getMaxArea(grid, row, col + 1);
    }

    public boolean inArea(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length;
    }
}