// Solution 1
/*
class Solution {
    private int idx = 2; // start from 2 to avoid conflicts
    private Map<Integer, Integer> idxToArea = new HashMap<>(); // island idx to area

    public int largestIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    int area = getMaxArea(grid, i, j);
                    idxToArea.put(idx, area);
                    idx++;
                }
            }
        }
        int maxConnectedArea = 0;
        // 如果当前存在island，将maxConnectedArea初始化为island的最大面积
        if(idxToArea.size() != 0) {
            maxConnectedArea = Collections.max(idxToArea.values());
        }
        // find water
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                // 只有当前坐标(i, j)为0的时候，尝试将当前坐标变为1，计算最大连通区域面积
                if(grid[i][j] == 0) {
                    int area = getConnectedArea(grid, i, j);
                    maxConnectedArea = Math.max(area, maxConnectedArea);
                }
            }
        }
        return maxConnectedArea;
    }

    public int getMaxArea(int[][] grid, int row, int col) {
        if(!inArea(grid, row, col)) return 0;
        if(grid[row][col] != 1) return 0;
        grid[row][col] = idx; // mark as idx
        return 1 
            + getMaxArea(grid, row - 1, col)
            + getMaxArea(grid, row + 1, col)
            + getMaxArea(grid, row, col - 1)
            + getMaxArea(grid, row, col + 1);
    }

    public boolean inArea(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length;
    }

    public int getConnectedArea(int[][] grid, int row, int col) {
        int res = 1;
        Set<Integer> islandIdx = new HashSet<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int i = 0; i < 4; i++) {
            int new_row = row + directions[i][0];
            int new_col = col + directions[i][1];
            if(inArea(grid, new_row, new_col) && grid[new_row][new_col] != 0) {
                islandIdx.add(grid[new_row][new_col]);
            }
        }
        for(int idx: islandIdx) {
            res += idxToArea.get(idx);
        }
        return res;
    }
}
*/

// Solution 2: 修改getConnectedArea函数的相关逻辑
class Solution {
    private int idx = 2; // start from 2 to avoid conflicts
    private Map<Integer, Integer> idxToArea = new HashMap<>(); // island idx to area

    public int largestIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    int area = getMaxArea(grid, i, j);
                    idxToArea.put(idx, area);
                    idx++;
                }
            }
        }
        int maxConnectedArea = 0;
        // find water
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                int area = getConnectedArea(grid, i, j); // 获取当前坐标(i, j)的最大连通区域面积
                maxConnectedArea = Math.max(area, maxConnectedArea);
            }
        }
        return maxConnectedArea;
    }

    public int getMaxArea(int[][] grid, int row, int col) {
        if(!inArea(grid, row, col)) return 0;
        if(grid[row][col] != 1) return 0;
        grid[row][col] = idx; // mark as idx
        return 1 
            + getMaxArea(grid, row - 1, col)
            + getMaxArea(grid, row + 1, col)
            + getMaxArea(grid, row, col - 1)
            + getMaxArea(grid, row, col + 1);
    }

    public boolean inArea(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length;
    }

    public int getConnectedArea(int[][] grid, int row, int col) {
        // 如果当前不为0，返回当前连通的最大区域面积
        if(grid[row][col] != 0) return idxToArea.get(grid[row][col]);
        // 否则，尝试将当前区域变为1，计算最大的连通面积
        int res = 1;
        Set<Integer> islandIdx = new HashSet<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int i = 0; i < 4; i++) {
            int new_row = row + directions[i][0];
            int new_col = col + directions[i][1];
            if(inArea(grid, new_row, new_col) && grid[new_row][new_col] != 0) {
                islandIdx.add(grid[new_row][new_col]);
            }
        }
        for(int idx: islandIdx) {
            res += idxToArea.get(idx);
        }
        return res;
    }
}