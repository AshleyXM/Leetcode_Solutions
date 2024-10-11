class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') { // 注意是和 char 类型的 '1' 比较，而不是 int 类型的 1
                    markIslandVisited(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }

    public void markIslandVisited(char[][] grid, int row, int col) {
        if(!inArea(grid, row, col)) return;
        if(grid[row][col] != '1') return;
        grid[row][col] = '2'; // mark it as 2 (visited)
        markIslandVisited(grid, row - 1, col);
        markIslandVisited(grid, row + 1, col); 
        markIslandVisited(grid, row, col - 1);
        markIslandVisited(grid, row, col + 1);
    }

    public boolean inArea(char[][] grid, int row, int col) {
        return row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length;
        }
}